// Generated from cTurtle2.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link cTurtle2Parser}.
 */
public interface cTurtle2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link cTurtle2Parser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(cTurtle2Parser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link cTurtle2Parser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(cTurtle2Parser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link cTurtle2Parser#moreStatements}.
	 * @param ctx the parse tree
	 */
	void enterMoreStatements(cTurtle2Parser.MoreStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link cTurtle2Parser#moreStatements}.
	 * @param ctx the parse tree
	 */
	void exitMoreStatements(cTurtle2Parser.MoreStatementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignStatementWrapper}
	 * labeled alternative in {@link cTurtle2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatementWrapper(cTurtle2Parser.AssignStatementWrapperContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignStatementWrapper}
	 * labeled alternative in {@link cTurtle2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatementWrapper(cTurtle2Parser.AssignStatementWrapperContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CommandStatementWrapper}
	 * labeled alternative in {@link cTurtle2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCommandStatementWrapper(cTurtle2Parser.CommandStatementWrapperContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CommandStatementWrapper}
	 * labeled alternative in {@link cTurtle2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCommandStatementWrapper(cTurtle2Parser.CommandStatementWrapperContext ctx);
	/**
	 * Enter a parse tree produced by {@link cTurtle2Parser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatement(cTurtle2Parser.AssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link cTurtle2Parser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatement(cTurtle2Parser.AssignStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link cTurtle2Parser#copyStatement}.
	 * @param ctx the parse tree
	 */
	void enterCopyStatement(cTurtle2Parser.CopyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link cTurtle2Parser#copyStatement}.
	 * @param ctx the parse tree
	 */
	void exitCopyStatement(cTurtle2Parser.CopyStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FillColor}
	 * labeled alternative in {@link cTurtle2Parser#descriptor}.
	 * @param ctx the parse tree
	 */
	void enterFillColor(cTurtle2Parser.FillColorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FillColor}
	 * labeled alternative in {@link cTurtle2Parser#descriptor}.
	 * @param ctx the parse tree
	 */
	void exitFillColor(cTurtle2Parser.FillColorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LineColor}
	 * labeled alternative in {@link cTurtle2Parser#descriptor}.
	 * @param ctx the parse tree
	 */
	void enterLineColor(cTurtle2Parser.LineColorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LineColor}
	 * labeled alternative in {@link cTurtle2Parser#descriptor}.
	 * @param ctx the parse tree
	 */
	void exitLineColor(cTurtle2Parser.LineColorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LineWidth}
	 * labeled alternative in {@link cTurtle2Parser#descriptor}.
	 * @param ctx the parse tree
	 */
	void enterLineWidth(cTurtle2Parser.LineWidthContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LineWidth}
	 * labeled alternative in {@link cTurtle2Parser#descriptor}.
	 * @param ctx the parse tree
	 */
	void exitLineWidth(cTurtle2Parser.LineWidthContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StartingPosition}
	 * labeled alternative in {@link cTurtle2Parser#descriptor}.
	 * @param ctx the parse tree
	 */
	void enterStartingPosition(cTurtle2Parser.StartingPositionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StartingPosition}
	 * labeled alternative in {@link cTurtle2Parser#descriptor}.
	 * @param ctx the parse tree
	 */
	void exitStartingPosition(cTurtle2Parser.StartingPositionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DrawingSpeed}
	 * labeled alternative in {@link cTurtle2Parser#descriptor}.
	 * @param ctx the parse tree
	 */
	void enterDrawingSpeed(cTurtle2Parser.DrawingSpeedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DrawingSpeed}
	 * labeled alternative in {@link cTurtle2Parser#descriptor}.
	 * @param ctx the parse tree
	 */
	void exitDrawingSpeed(cTurtle2Parser.DrawingSpeedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RectSize}
	 * labeled alternative in {@link cTurtle2Parser#descriptor}.
	 * @param ctx the parse tree
	 */
	void enterRectSize(cTurtle2Parser.RectSizeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RectSize}
	 * labeled alternative in {@link cTurtle2Parser#descriptor}.
	 * @param ctx the parse tree
	 */
	void exitRectSize(cTurtle2Parser.RectSizeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CircleRadius}
	 * labeled alternative in {@link cTurtle2Parser#descriptor}.
	 * @param ctx the parse tree
	 */
	void enterCircleRadius(cTurtle2Parser.CircleRadiusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CircleRadius}
	 * labeled alternative in {@link cTurtle2Parser#descriptor}.
	 * @param ctx the parse tree
	 */
	void exitCircleRadius(cTurtle2Parser.CircleRadiusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PolygonSideLength}
	 * labeled alternative in {@link cTurtle2Parser#descriptor}.
	 * @param ctx the parse tree
	 */
	void enterPolygonSideLength(cTurtle2Parser.PolygonSideLengthContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PolygonSideLength}
	 * labeled alternative in {@link cTurtle2Parser#descriptor}.
	 * @param ctx the parse tree
	 */
	void exitPolygonSideLength(cTurtle2Parser.PolygonSideLengthContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColorPropertyFillColor}
	 * labeled alternative in {@link cTurtle2Parser#colorProperty}.
	 * @param ctx the parse tree
	 */
	void enterColorPropertyFillColor(cTurtle2Parser.ColorPropertyFillColorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColorPropertyFillColor}
	 * labeled alternative in {@link cTurtle2Parser#colorProperty}.
	 * @param ctx the parse tree
	 */
	void exitColorPropertyFillColor(cTurtle2Parser.ColorPropertyFillColorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColorPropertyLineColor}
	 * labeled alternative in {@link cTurtle2Parser#colorProperty}.
	 * @param ctx the parse tree
	 */
	void enterColorPropertyLineColor(cTurtle2Parser.ColorPropertyLineColorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColorPropertyLineColor}
	 * labeled alternative in {@link cTurtle2Parser#colorProperty}.
	 * @param ctx the parse tree
	 */
	void exitColorPropertyLineColor(cTurtle2Parser.ColorPropertyLineColorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SpeedInstantaneous}
	 * labeled alternative in {@link cTurtle2Parser#speed}.
	 * @param ctx the parse tree
	 */
	void enterSpeedInstantaneous(cTurtle2Parser.SpeedInstantaneousContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SpeedInstantaneous}
	 * labeled alternative in {@link cTurtle2Parser#speed}.
	 * @param ctx the parse tree
	 */
	void exitSpeedInstantaneous(cTurtle2Parser.SpeedInstantaneousContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SpeedDigit}
	 * labeled alternative in {@link cTurtle2Parser#speed}.
	 * @param ctx the parse tree
	 */
	void enterSpeedDigit(cTurtle2Parser.SpeedDigitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SpeedDigit}
	 * labeled alternative in {@link cTurtle2Parser#speed}.
	 * @param ctx the parse tree
	 */
	void exitSpeedDigit(cTurtle2Parser.SpeedDigitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColorRGB}
	 * labeled alternative in {@link cTurtle2Parser#color}.
	 * @param ctx the parse tree
	 */
	void enterColorRGB(cTurtle2Parser.ColorRGBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColorRGB}
	 * labeled alternative in {@link cTurtle2Parser#color}.
	 * @param ctx the parse tree
	 */
	void exitColorRGB(cTurtle2Parser.ColorRGBContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColorString}
	 * labeled alternative in {@link cTurtle2Parser#color}.
	 * @param ctx the parse tree
	 */
	void enterColorString(cTurtle2Parser.ColorStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColorString}
	 * labeled alternative in {@link cTurtle2Parser#color}.
	 * @param ctx the parse tree
	 */
	void exitColorString(cTurtle2Parser.ColorStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link cTurtle2Parser#rectangleSize}.
	 * @param ctx the parse tree
	 */
	void enterRectangleSize(cTurtle2Parser.RectangleSizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link cTurtle2Parser#rectangleSize}.
	 * @param ctx the parse tree
	 */
	void exitRectangleSize(cTurtle2Parser.RectangleSizeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectCoordinate}
	 * labeled alternative in {@link cTurtle2Parser#object}.
	 * @param ctx the parse tree
	 */
	void enterObjectCoordinate(cTurtle2Parser.ObjectCoordinateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectCoordinate}
	 * labeled alternative in {@link cTurtle2Parser#object}.
	 * @param ctx the parse tree
	 */
	void exitObjectCoordinate(cTurtle2Parser.ObjectCoordinateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectShape}
	 * labeled alternative in {@link cTurtle2Parser#object}.
	 * @param ctx the parse tree
	 */
	void enterObjectShape(cTurtle2Parser.ObjectShapeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectShape}
	 * labeled alternative in {@link cTurtle2Parser#object}.
	 * @param ctx the parse tree
	 */
	void exitObjectShape(cTurtle2Parser.ObjectShapeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectPolygon}
	 * labeled alternative in {@link cTurtle2Parser#object}.
	 * @param ctx the parse tree
	 */
	void enterObjectPolygon(cTurtle2Parser.ObjectPolygonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectPolygon}
	 * labeled alternative in {@link cTurtle2Parser#object}.
	 * @param ctx the parse tree
	 */
	void exitObjectPolygon(cTurtle2Parser.ObjectPolygonContext ctx);
	/**
	 * Enter a parse tree produced by {@link cTurtle2Parser#coordinate}.
	 * @param ctx the parse tree
	 */
	void enterCoordinate(cTurtle2Parser.CoordinateContext ctx);
	/**
	 * Exit a parse tree produced by {@link cTurtle2Parser#coordinate}.
	 * @param ctx the parse tree
	 */
	void exitCoordinate(cTurtle2Parser.CoordinateContext ctx);
	/**
	 * Enter a parse tree produced by {@link cTurtle2Parser#negativeX}.
	 * @param ctx the parse tree
	 */
	void enterNegativeX(cTurtle2Parser.NegativeXContext ctx);
	/**
	 * Exit a parse tree produced by {@link cTurtle2Parser#negativeX}.
	 * @param ctx the parse tree
	 */
	void exitNegativeX(cTurtle2Parser.NegativeXContext ctx);
	/**
	 * Enter a parse tree produced by {@link cTurtle2Parser#negativeY}.
	 * @param ctx the parse tree
	 */
	void enterNegativeY(cTurtle2Parser.NegativeYContext ctx);
	/**
	 * Exit a parse tree produced by {@link cTurtle2Parser#negativeY}.
	 * @param ctx the parse tree
	 */
	void exitNegativeY(cTurtle2Parser.NegativeYContext ctx);
	/**
	 * Enter a parse tree produced by {@link cTurtle2Parser#polygon}.
	 * @param ctx the parse tree
	 */
	void enterPolygon(cTurtle2Parser.PolygonContext ctx);
	/**
	 * Exit a parse tree produced by {@link cTurtle2Parser#polygon}.
	 * @param ctx the parse tree
	 */
	void exitPolygon(cTurtle2Parser.PolygonContext ctx);
	/**
	 * Enter a parse tree produced by {@link cTurtle2Parser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(cTurtle2Parser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link cTurtle2Parser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(cTurtle2Parser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link cTurtle2Parser#commandStatement}.
	 * @param ctx the parse tree
	 */
	void enterCommandStatement(cTurtle2Parser.CommandStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link cTurtle2Parser#commandStatement}.
	 * @param ctx the parse tree
	 */
	void exitCommandStatement(cTurtle2Parser.CommandStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link cTurtle2Parser#drawStatement}.
	 * @param ctx the parse tree
	 */
	void enterDrawStatement(cTurtle2Parser.DrawStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link cTurtle2Parser#drawStatement}.
	 * @param ctx the parse tree
	 */
	void exitDrawStatement(cTurtle2Parser.DrawStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link cTurtle2Parser#deleteStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeleteStatement(cTurtle2Parser.DeleteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link cTurtle2Parser#deleteStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeleteStatement(cTurtle2Parser.DeleteStatementContext ctx);
}