Project by: Noah Drabinsky, Zach Alford, Sam Bolds

Included in this project is an example file in our language (House.txt), 
our grammer (cTurtle2.g4), the Translator files we wrote (Translator.stg and Translator.java),
example output (House.py), and a screenshot for this example (Screenshot of the house example . docx).
Finally, the files that are necessary to use our language are in the folder "FolderContainingFilesForExecution";
this folder contains the java files necessary after compilation, where Translator.java contains the main() function of the program.

Tunnel Vision Laboratories’ ANTLRWorks 2 software (https://github.com/tunnelvisionlabs/antlrworks2) generates a Java lexer and parser 
for the grammar, as well as a parse tree listener.

Instructions to compile and use cTurtle2
1. Write a file in our language
2. Optional step to compile: (within FolderContainingFilesForExecution, the files are already compiled, but if you wish to edit the Java files, you must recompile) run at command line "javac *.java" (if necessary, first install ANTLRWorks 2 software above for the required modules)
3. (within FolderContainingFilesForExecution) run at command line "java Translator < inputfile.txt > outfile.py"
4. run outfile.py (you must have the cTurtle module installed (see https://www.cs.ucsb.edu/~pconrad/cs8/topics/cTurtle/))
5. Watch the drawing 


(Zach Alford) For the project to continue, it needs refactoring, in order to be more modular. Then, the language could
be improved to be more concise. The language could also be improved to import drawings from other files, and easily build
off of these imported drawings.

