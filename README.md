# Defuck
some collection of Brainfuck interpreters in Java with varying traits  
(plan to add a decompiler eventually)

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