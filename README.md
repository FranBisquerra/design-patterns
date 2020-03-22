# design-patterns
Basic examples of useful design patterns, on each repository tag the main program
uses the implemented pattern.

## List of covered patterns

### Behavioural patterns

#### Memento pattern
    Useful to deal with problems such as the history of changes in a text editor.
    
#### State pattern
    Allows an object to alter its behaviour when its internal state changes

#### Iterator pattern
    Allows the secuential iteration of an object collection attribute decoupled from its implementation.
    
#### Strategy pattern
    Allows the selection of the algorithm to use at runtime, similar to the state pattern it is different to its counterpart in the fact that it does not modify the object state but only its behaviour.

#### Template Method pattern
    Uses a template method, usually in an abstract class, to define de skeleton of an operation in terms od a number a high-level steps.
    
#### Command pattern
    Used to encapsulate all information needed to perform an action or trigger an event at a later time. 
    It can also be used to perform multiple actions creating a Composite command or to track the history of executed commands, Similar to the memento pattern.
    Unlike the memento pattern it does not store full states, the implmented commands know how to execute and unexecute themselves.
    
#### Observer pattern
    Used to notify dependant object that a change in its dependency happened.