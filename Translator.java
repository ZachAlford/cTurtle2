import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.stringtemplate.v4.*;
import java.lang.*;
import java.util.*;

public class Translator extends cTurtle2BaseListener {
	STGroup group = new STGroupFile("Translator.stg"); // group.getInstanceOf(...) makes the various StringTemplates accessible in the methods below
	ParseTreeProperty<ST> STMap = new ParseTreeProperty<ST>(); // this Map takes a ctx (a Parse Tree node) as a key, and returns a String Template. The primary way our Translator passes StringTemplates up the Parse Tree is with this Map
	List<ST> ListOfFunctionSTs = new ArrayList<ST>(); // these two lists were a way of sending certain String Templates to the exitFile() function (which builds the driving String Template, the outputted Python file)
	List<ST> ListOfStatementSTs = new ArrayList<ST>();
	Map<String, Turtle> TurtleMap = new HashMap<String, Turtle>();// the main use of this and the class below was to make work the "turtle.attribute" functionality of our language. Would have been a more efficient way to store the input, in retrospect.

	public static class Turtle { 
		String Name;
		String FillColor;
		String LineColor;
		String LineWidth;
		String StartingPosX;
		String StartingPosY;
		String DrawingSpeed;
		String RectangleWidth;
		String RectangleHeight;
		String Radius;
		String PolygonSideLength;
		int FunctionCounter = 0;
		public Turtle(String Name) {
			this.Name = Name;
		}
		public String toString() { // for debugging purposes
			StringBuffer ReturnString = new StringBuffer();
			ReturnString.append("Turtle's name " + this.Name + "\n");
			ReturnString.append("Turtle's FillColor " + this.FillColor);
			ReturnString.append("\n");
			ReturnString.append("Turtle's LineColor " + this.LineColor);
			ReturnString.append("\n");
			ReturnString.append("Turtle's LineWidth " + this.LineWidth);
			ReturnString.append("\n");
			ReturnString.append("Turtle's Starting position" + this.StartingPosX + "," + this.StartingPosY);
			ReturnString.append("\n");
			ReturnString.append("Turtle's Drawing Speed" + this.DrawingSpeed);
			ReturnString.append("\n");
			ReturnString.append("Turtle's Rectangle Width" + this.RectangleWidth);
			ReturnString.append("\n");
			ReturnString.append("Turtle's Rectangle Height "  + this.RectangleHeight);
			ReturnString.append("\n");
			ReturnString.append("Turtle's Radius " + this.Radius);
			ReturnString.append("\n");
			ReturnString.append("Turtle's Polygon Side Length " + this.PolygonSideLength);
			return ReturnString.toString();
		}
		
	}

	/*
		The remaining functions (except for main()) build String Templates while walking the parse tree. The main functions here are exitFile() and exitAssignStatement(). All of these, except for the main() function below, extend the functions from cTurtle2BaseListener, and use functionality from cTurtle2Parser.

	*/

	@Override 
	public void exitFile(cTurtle2Parser.FileContext ctx) { /*
		The call to println at the end of this function prints out the text of the Python file to main,
		which is the desired outcome of the program
		*/

		ST FileStatement = group.getInstanceOf("file");
		ST MainStatement = group.getInstanceOf("main");

		//Add the auto-generated functions (one for each drawing statement) to the body of the python file	
		for (int i = 0; i < ListOfFunctionSTs.size(); i++) {
			FileStatement.add("functions", ListOfFunctionSTs.get(i));
		}

		/*Add the auto-generated statements to the body of main(). These statements call the appropriate
		auto-generated functions 	
		*/
		for (int i = 0; i < ListOfStatementSTs.size(); i++) {
			MainStatement.add("statements", ListOfStatementSTs.get(i).render());
		}

		//Add main to the body of the python file
		FileStatement.add("main", MainStatement.render());

		System.out.println(FileStatement.render());
	}

	// exitDrawStatement() and exitDeleteStatement() both add statements to body of main() by exitFile() using ListOfStatementSTs
	@Override 
	public void exitDrawStatement(cTurtle2Parser.DrawStatementContext ctx) { 
		ST DrawStatement = group.getInstanceOf("drawStatement");	
		DrawStatement.add("turtle", TurtleMap.get(ctx.VARIABLE().getText()).Name);
		ListOfStatementSTs.add(DrawStatement);
	}

	@Override 
	public void exitDeleteStatement(cTurtle2Parser.DeleteStatementContext ctx) { 
		ST DeleteStatement = group.getInstanceOf("deleteStatement");	
		DeleteStatement.add("turtle", ctx.VARIABLE().getText());
		ListOfStatementSTs.add(DeleteStatement);
	}

	/* 2 purposes for exitAssignStatement()
	Populate and place CurrentTurtle in TurtleMap, for later use in exitDrawStatement()
	Populate and place newFunction in ListOfFunctionSTs, for later use in exitFile()
	 */
	@Override 
	public void exitAssignStatement(cTurtle2Parser.AssignStatementContext ctx) { 
		// Because an Assignment Statement is an implicit creation of a turtle, make a Creation Statement also
		ST CreateStatement = group.getInstanceOf("createStatement");
		Turtle CurrentTurtle;
		// Due to functions below, CurrentTurtle  may have certain attributes already
		if (TurtleMap.get(ctx.VARIABLE().getText()) == null) {
			CurrentTurtle = new Turtle(ctx.VARIABLE().getText() + 0);
		} else {
			CurrentTurtle = TurtleMap.get(ctx.VARIABLE().getText());
			CurrentTurtle.FunctionCounter++;
			CurrentTurtle.Name = ctx.VARIABLE().getText() + CurrentTurtle.FunctionCounter;
		}
		
		// Add creation statement for CurrentTurtle to main
		CreateStatement.add("turtle", CurrentTurtle.Name);
		ListOfStatementSTs.add(CreateStatement);

		// Build corresponding function for CurrentTurtle
		ST newFunction = group.getInstanceOf("function");
		newFunction.add("name",  CurrentTurtle.Name);

		// Statements within CurrentTurtle's function about the object CurrentTurtle draws
		ST ObjectStatement = STMap.get(ctx.object());

		Boolean isFillColor = false;
		if (ctx.getChildCount() > 3) { // if there are in fact Descriptor children of Object
			for (int i = 0 ; i < (ctx.getChildCount()-3); i++) { // add DescriptorStatement python code to CurrentTurtle's function

				// Statements about the descriptor
				ST DescriptorStatement = STMap.get(ctx.descriptor(i));
				if ( DescriptorStatement.getName().compareTo("/RectangleSize") == 0 ) { // add data to CurrentTurtle for use higher up the parse tree, and data to the ObjectStatement
					ObjectStatement.add("length", DescriptorStatement.getAttribute("l").toString());
					ObjectStatement.add("width", DescriptorStatement.getAttribute("w").toString());
					CurrentTurtle.RectangleHeight = DescriptorStatement.getAttribute("l").toString();
					CurrentTurtle.RectangleWidth = DescriptorStatement.getAttribute("w").toString();
				} else if ( DescriptorStatement.getName().compareTo("/PolygonSideLength") == 0 ) {// add data to CurrentTurtle for use higher up the parse tree, and data to the ObjectStatement
					ObjectStatement.add("length", DescriptorStatement.render());
					CurrentTurtle.PolygonSideLength = DescriptorStatement.render();
				} else if ( DescriptorStatement.getName().compareTo("/Radius") == 0 ) {// add data to CurrentTurtle for use higher up the parse tree, and data to the ObjectStatement
					ObjectStatement.add("radius", DescriptorStatement.render());
					CurrentTurtle.Radius = DescriptorStatement.render();
				} else { //add any data below to newFunction, as such data does not pertain to the ObjectStatement
					if (STMap.get(ctx.descriptor(i)).getName().compareTo("/FillColor") == 0 ) {
						isFillColor = true;
						CurrentTurtle.FillColor = DescriptorStatement.getAttribute("color").toString();
					}
					if (STMap.get(ctx.descriptor(i)).getName().compareTo("/LineColor") == 0 ) {
						CurrentTurtle.LineColor = DescriptorStatement.getAttribute("color").toString();
					}
					if ( STMap.get(ctx.descriptor(i)).getName().compareTo("/LineWidth") == 0 ) {
						CurrentTurtle.LineWidth = DescriptorStatement.getAttribute("size").toString();
					}
					if ( STMap.get(ctx.descriptor(i)).getName().compareTo("/StartingPos") == 0 ) {
						CurrentTurtle.StartingPosX = DescriptorStatement.getAttribute("x").toString();
						CurrentTurtle.StartingPosY = DescriptorStatement.getAttribute("y").toString();
					}
					if ( STMap.get(ctx.descriptor(i)).getName().compareTo("/DrawingSpeedDigit") == 0 ) {
						CurrentTurtle.DrawingSpeed = DescriptorStatement.getAttribute("speed").toString();
					}
					if ( STMap.get(ctx.descriptor(i)).getName().compareTo("/DrawingSpeedInstantaneous") == 0 ) {
						CurrentTurtle.DrawingSpeed = "instantaneous";
					}
					newFunction.add("statements", DescriptorStatement.render());
				}
			}
			if (isFillColor) {
				newFunction.add("statements", "turtle.begin_fill()");	
				newFunction.add("statements", "turtle.pendown()");	
				newFunction.add("statements", ObjectStatement.render());
				newFunction.add("statements", "turtle.penup()");	
				newFunction.add("statements", "turtle.end_fill()");	
				isFillColor = false;
			}
			else {
				newFunction.add("statements", ObjectStatement.render());
			}
		}
		else {
			newFunction.add("statements", ObjectStatement.render());
		}

		// Place CurrentTurtle in TurtleMap, for later use in exitFile()
		TurtleMap.put(ctx.VARIABLE().getText(), CurrentTurtle);

		// Place newFunction in ListOfFunctionSTs, for later use in exitFile()
		ListOfFunctionSTs.add(newFunction);
	}
	
	@Override 
	public void exitObjectShape(cTurtle2Parser.ObjectShapeContext ctx) {
		if (ctx.SHAPE().getText().compareTo("circle") == 0) {
			ST circleStatement = group.getInstanceOf("circle");
			STMap.put(ctx, circleStatement);
			//System.out.println(ctx.getParent().VARIABLE().getText());
		}
		else if (ctx.SHAPE().getText().compareTo("rectangle") == 0) {
			ST rectangleStatement = group.getInstanceOf("rectangle");
			STMap.put(ctx, rectangleStatement);
		}
	}

	@Override 
	public void exitPolygon(cTurtle2Parser.PolygonContext ctx) { 
		ST PolygonStatement = group.getInstanceOf("polygon");
		PolygonStatement.add("sides", STMap.get(ctx.number()).render());
		STMap.put(ctx, PolygonStatement);
	}

	@Override 
	public void exitObjectPolygon(cTurtle2Parser.ObjectPolygonContext ctx) { 
		ST PolygonStatement = STMap.get(ctx.polygon());
		STMap.put(ctx, PolygonStatement);
	}

	@Override 
	public void exitCoordinate(cTurtle2Parser.CoordinateContext ctx) {
		ST LineStatement = group.getInstanceOf("line");
		if (ctx.negativeX() != null) {
			LineStatement.add("x", "-" + STMap.get(ctx.number(0)).render());
		} else {
			LineStatement.add("x", STMap.get(ctx.number(0)).render());
		}
		if (ctx.negativeY() != null) {
			LineStatement.add("y", "-" + STMap.get(ctx.number(1)).render());
		} else {
			LineStatement.add("y", STMap.get(ctx.number(1)).render());
		}
		STMap.put(ctx, LineStatement);
	}

	@Override 
	public void exitObjectCoordinate(cTurtle2Parser.ObjectCoordinateContext ctx) { 
		int i = 0;
		ST LinesStatement = group.getInstanceOf("lines");
		while (ctx.coordinate(i) != null) {
			LinesStatement.add("line", STMap.get(ctx.coordinate(i)));
			i++;
		}
		STMap.put(ctx, LinesStatement);
	}

	@Override 
	public void exitRectSize(cTurtle2Parser.RectSizeContext ctx) { 
		ST RectangleSizeStatement = STMap.get(ctx.rectangleSize());
		STMap.put(ctx, RectangleSizeStatement);
	}

	@Override 
	public void exitStartingPosition(cTurtle2Parser.StartingPositionContext ctx) {
		ST StartingPositionStatement = group.getInstanceOf("StartingPos");
		if (ctx.VARIABLE() == null) { // not referencing the attribute of another turtle
			ST CoordinateStatement = STMap.get(ctx.coordinate());
			StartingPositionStatement.add("x", CoordinateStatement.getAttribute("x").toString());
			StartingPositionStatement.add("y", CoordinateStatement.getAttribute("y").toString());
		} else { // is referencing the attribute of another turtle
			StartingPositionStatement.add("x", TurtleMap.get(ctx.VARIABLE().getText()).StartingPosX);
			StartingPositionStatement.add("y", TurtleMap.get(ctx.VARIABLE().getText()).StartingPosY);
		}
		STMap.put(ctx, StartingPositionStatement);
	}

	@Override 
	public void exitRectangleSize(cTurtle2Parser.RectangleSizeContext ctx) { 
		ST RectangleSizeStatement = group.getInstanceOf("RectangleSize");
		RectangleSizeStatement.add("l", STMap.get(ctx.number(0)).render());
		RectangleSizeStatement.add("w", STMap.get(ctx.number(1)).render());
		STMap.put(ctx, RectangleSizeStatement);
	}

	@Override 
	public void exitLineWidth(cTurtle2Parser.LineWidthContext ctx) {
		ST LineWidthStatement = group.getInstanceOf("LineWidth");
		if (ctx.VARIABLE() == null) { // not referencing the attribute of another turtle
			LineWidthStatement.add("size", STMap.get(ctx.number()).render());
		} else { // is referencing the attribute of another turtle
			LineWidthStatement.add("size", TurtleMap.get(ctx.VARIABLE().getText()).LineWidth);
		}
		STMap.put(ctx, LineWidthStatement);
	}

	@Override 
	public void exitNumber(cTurtle2Parser.NumberContext ctx) { 
		int childCount = ctx.getChildCount();
		StringBuffer Number = new StringBuffer();
		for (int i = 0; i < childCount; i++) {
			Number.append(ctx.DIGIT(i).getText());
		}
		ST numberStatement = group.getInstanceOf("Number");
		numberStatement.add("n", Number.toString());
		STMap.put(ctx, numberStatement);
	}

	@Override 
	public void exitDrawingSpeed(cTurtle2Parser.DrawingSpeedContext ctx) { 
		ST SpeedStatement;
		if (ctx.VARIABLE() == null) { // not referencing the attribute of another turtle
			SpeedStatement = STMap.get(ctx.speed());	
		} else { // is referencing the attribute of another turtle
			if (TurtleMap.get(ctx.VARIABLE().getText()).DrawingSpeed.compareTo("instantaneous") == 0) {
				SpeedStatement = group.getInstanceOf("DrawingSpeedInstantanoues");	
			} else {
				SpeedStatement = group.getInstanceOf("DrawingSpeedDigit");
				SpeedStatement.add("speed", TurtleMap.get(ctx.VARIABLE().getText()).DrawingSpeed);
			}
		}
		STMap.put(ctx, SpeedStatement);
	}

	@Override 
	public void exitSpeedDigit(cTurtle2Parser.SpeedDigitContext ctx) { 
		ST SpeedDigitStatement = group.getInstanceOf("DrawingSpeedDigit");
		SpeedDigitStatement.add("speed", ctx.DIGIT().getText());
		STMap.put(ctx, SpeedDigitStatement);
	}

	@Override 
	public void exitSpeedInstantaneous(cTurtle2Parser.SpeedInstantaneousContext ctx) {
		STMap.put(ctx, group.getInstanceOf("DrawingSpeedInstantaneous"));
	}

	@Override 
	public void exitFillColor(cTurtle2Parser.FillColorContext ctx) { 
		ST FillColorStatement = group.getInstanceOf("FillColor");
		if (ctx.VARIABLE() == null) { // not referencing the attribute of another turtle
			FillColorStatement.add("color", STMap.get(ctx.color()).render());
		} else { // is referencing the attribute of another turtle
			if (STMap.get(ctx.colorProperty()).getName().compareTo("/FillColor") == 0) {
				FillColorStatement.add("color", TurtleMap.get(ctx.VARIABLE().getText()).FillColor);
			} else {
				FillColorStatement.add("color", TurtleMap.get(ctx.VARIABLE().getText()).LineColor);
			}
		}
		STMap.put(ctx, FillColorStatement);
	}

	@Override 
	public void exitLineColor(cTurtle2Parser.LineColorContext ctx) { 
		ST LineColorStatement = group.getInstanceOf("LineColor");
		if (ctx.VARIABLE() == null) { // not referencing the attribute of another turtle
			LineColorStatement.add("color", STMap.get(ctx.color()).render());
		} else { // is referencing the attribute of another turtle
			if (STMap.get(ctx.colorProperty()).getName().compareTo("/FillColor") == 0) {
				LineColorStatement.add("color", TurtleMap.get(ctx.VARIABLE().getText()).FillColor);
			} else {
				LineColorStatement.add("color", TurtleMap.get(ctx.VARIABLE().getText()).LineColor);
			}
		}
		STMap.put(ctx, LineColorStatement);
	}

	@Override 
	public void exitColorPropertyLineColor(cTurtle2Parser.ColorPropertyLineColorContext ctx) { 
		STMap.put(ctx, group.getInstanceOf("LineColor"));
	}

	@Override 
	public void exitColorPropertyFillColor(cTurtle2Parser.ColorPropertyFillColorContext ctx) { 
		STMap.put(ctx, group.getInstanceOf("FillColor"));
	}

	@Override 
	public void exitColorString(cTurtle2Parser.ColorStringContext ctx) {
		ST ColorStringStatement = group.getInstanceOf("StringColorInput");
		ColorStringStatement.add("string", ctx.COLOR().getText());
		STMap.put(ctx, ColorStringStatement);
	}

	@Override 
	public void exitColorRGB(cTurtle2Parser.ColorRGBContext ctx) { 
		ST RGBStatement = group.getInstanceOf("NumColorInput");
		RGBStatement.add("r", STMap.get(ctx.number(0)).render());
		RGBStatement.add("g", STMap.get(ctx.number(1)).render());
		RGBStatement.add("b", STMap.get(ctx.number(2)).render());
		STMap.put(ctx, RGBStatement);
	}

	@Override 
	public void exitPolygonSideLength(cTurtle2Parser.PolygonSideLengthContext ctx) { 
		ST PolygonSideLengthStatement = group.getInstanceOf("PolygonSideLength");
		PolygonSideLengthStatement.add("n", STMap.get(ctx.number()).render());
		STMap.put(ctx, PolygonSideLengthStatement);
	}

	@Override 
	public void exitCircleRadius(cTurtle2Parser.CircleRadiusContext ctx) { 
		ST CircleRadiusStatement = group.getInstanceOf("Radius");
		CircleRadiusStatement.add("n", STMap.get(ctx.number()).render());
		STMap.put(ctx, CircleRadiusStatement);
	}

	static public void main(String[] args) throws Exception {
        ANTLRInputStream  input  = new ANTLRInputStream(System.in);
        cTurtle2Lexer  lexer  = new cTurtle2Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        cTurtle2Parser parser = new cTurtle2Parser(tokens);
	
        
        Translator myTranslator = new Translator();
        parser.addParseListener(myTranslator);
        
        ParseTree tree = parser.file();
        
    }
}

