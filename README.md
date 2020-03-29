# design-patterns
Basic examples of useful design patterns.

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

#### Mediator pattern
    Design to manage the interaction between different components in a centralized way having all the business logic in the mediator object.
    In oder to prevent the mediator implementation to manage all the logic that might end up with a lot of conditions depending on the amount of components
    as seen in tag *mediator-pattern*. It can be implemented using the observer pattern, this way an event handler is attached to each component 
    implementation and this eventHandler contains the bussiness logic.
    
#### Chain of responsibility pattern
    Lets you pass requests along a chain of handlers. Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain. 