# Defuck
some collection of Brainfuck interpreters in Java with varying traits  

### Interpreter
- parses the code

### abstract BasicInterpreter extends Interpreter
- the basicest implementation
- executes instruction by instruction
- 60000 cells in memory, pointer starts in middle

### InfinityInterpreter extends Interpreter
- virtually infinite memory

### DebugInterpreter extends InfinityInterpreter
- prints instruction pointer and memory avfter each instruction
- checks for balanced loops

### abstract OptimisingInterpreter extends Interpreter
- checks for balanced loops

### CollapsingInterpreter extends OptimisingInterpreter
- does basic combining of plus and move instructions

### FlowInterpreter extends CollapsingInterpreter
- recognises most logical patterns


## Additionally, some Decompilers have been made
one that generates Java sourcecode and one that generates Swift  
they are both based on FlowInterpreter's optimised code and are both detrimentally slow compared to how optimised FlowInterpreter is  
if you just run the generated swift sourcecode with `swift <file>` it's an absolute joke