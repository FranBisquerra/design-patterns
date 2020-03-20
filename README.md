# design-patterns
Basic examples of useful design patterns, on each repository tag the main program
uses the implemented pattern.

## List of covered patterns

### Memento pattern
    Behavioural pattern
    Useful to deal with problems such as the history of changes in a text editor.
    
### State pattern
    Behavioural pattern
    Allows an object to alter its behaviour when its internal state changes

### Iterator pattern
    Behavioural pattern
    Allows the secuential iteration of an object collection attribute decoupled from its implementation.
    
### Strategy pattern
    Behavioural pattern
    Allows the selection of the algorithm to use at runtime, similar to the state pattern it is different to its counterpart in the fact that it does not modify the object state but only its behaviour.

### Template pattern
    Behavioural pattern
    Uses a template method, usually in an abstract class, to define de skeleton of an operation in terms od a number a high-level steps.
    
### Command pattern
    Behavioural pattern
    Used to encapsulate all information needed to perform an action or trigger an event at a later time. 
    It can also be used to perform multiple actions creating a Composite command or to track the history of executed commands, Similar to the state pattern.
    Unlike the state pattern it does not store full states, the implmented commands know how to execute and unexecute themselves.