/*
Zach
Noah
Sam
 */

grammar cTurtle2;

//starting rule
file: statement moreStatements;

moreStatements: statement moreStatements
              | ;

//a rule representing one statement in our langauge
statement: assignStatement '.' # AssignStatementWrapper
        | commandStatement '.' # CommandStatementWrapper
         ;

//assigning a drawing and its parameters to a variable
//the funcationality of variables is that they represent the specific drawings that are on the canvas
assignStatement: VARIABLE '->' (descriptor* object | copyStatement);

//copy/paste for shapes
copyStatement:  VARIABLE;

//parameters for the drawing that is assigned to a variable
descriptor: 'fill-color' '=' (color | VARIABLE '.' colorProperty) ','  # FillColor
          | 'line-color' '=' (color | VARIABLE '.' colorProperty) ','  # LineColor
          | 'line-width' '=' ( number | VARIABLE '.' 'line-width') ',' # LineWidth
          | 'starting-position' '=' (coordinate | VARIABLE '.' 'starting-position') ',' # StartingPosition
          | 'drawing-speed' '=' (speed | VARIABLE '.' 'drawing-speed') ',' # DrawingSpeed
          | rectangleSize ',' # RectSize
          | 'radius' '=' number ',' # CircleRadius
          | 'side-length' '=' number ',' # PolygonSideLength
              ;

colorProperty: 'fill-color' # ColorPropertyFillColor
        | 'line-color' # ColorPropertyLineColor
             ;

//speed the turtle draws at
speed: 'instantaneous' # SpeedInstantaneous
     | DIGIT  # SpeedDigit
     ;

color: 'rgb(' number ',' number ',' number ')'  # ColorRGB
     | COLOR # ColorString
       ;

rectangleSize: number ('x' | 'X' | '*') number;

//the actual drawing represented by a variable
object: 'line'  ( 'to' coordinate | 'through' ('[' (coordinate ',')* coordinate ']') ) # ObjectCoordinate
        | SHAPE  # ObjectShape
        | polygon  # ObjectPolygon
      ;

//objectCoordinate: 'line' 'to' coordinate ;
//objectShape: SHAPE ;

//position on the canvas
coordinate: '(' negativeX? number ',' negativeY? number ')' ;

negativeX: '-' ;
negativeY: '-' ;

//shape of n number sides
polygon: number '-gon';

number: DIGIT+;

//The user has certain actions available to manipulate the turtA
commandStatement: drawStatement
                //| modifyStatement
                | deleteStatement;
     
drawStatement: 'draw' VARIABLE; //renders the drawing of the variable
deleteStatement: 'delete' VARIABLE; //deletes the drawing of the variable
/* future functionality - makes a drawing reuasble by saving to file
saveStatement: 'save' VARIABLE ('+' VARIABLE)*  'as' VARIABLE;
modifyStatement: 'modify' VARIABLE '->' descriptor*; //changes parameters such as color or position of existing drawing
*/

//Tokens
SHAPE: 'rectangle' | 'circle' ; //'star';
COLOR: 'blue' | 'red' | 'yellow'| 'purple' | 'green' | 'orange' | 'pink' | 'teal';
DIGIT: '0'..'9';
VARIABLE: ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9')*;
WS : (' '|'\t'|'\n'|'\r')+ {skip();};