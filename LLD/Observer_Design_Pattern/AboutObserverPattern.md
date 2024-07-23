# What is Observer pattern

The Observer Pattern is a behavioral design pattern that allows an object (known as the subject) to notify other objects (known as observers) about changes in its state. The observers are automatically updated whenever the state of the subject changes, promoting a loosely coupled interaction between the subject and its observers.

### Key Components
**Subject:** The object that holds the state and sends notifications to observers when the state changes.

**Observer:** The objects that need to be updated when the subject's state changes. Observers register themselves with the subject to receive updates.

**ConcreteSubject:** A concrete implementation of the subject.

**ConcreteObserver:** A concrete implementation of an observer that responds to updates from the subject.

# Scenarios Used In:

1. Multiple Dependent Objects:
    - When multiple objects need to be updated automatically when another object changes state.
    - Example: A user interface that needs to update several views when the data model changes.

2. Decoupling Objects:
    - When you want to decouple an object from the list of objects that depend on it, allowing for more modular and reusable code.
    - Example: A stock market application where the stock price changes should notify various displays and analysis tools without tightly coupling them.

3. Event Handling Systems:
    - When implementing a system where various components need to react to specific events or state changes.
    - Example: A GUI framework where buttons, sliders, and other controls need to notify the application when they are interacted with.

4. Dynamic Relationships:
    - When relationships between objects are established at runtime, and you need a way to manage these dynamic relationships.
    - Example: A chat application where users can subscribe to message notifications from different chat rooms dynamically.

5. Broadcast Communication:
    - When an object needs to communicate with a variable number of other objects, which can change over time.
    - Example: A messaging system where a server needs to broadcast messages to all connected clients, and clients can connect or disconnect at any time.

# Summary

**Observer Pattern** helps you establish a subscription mechanism to notify multiple objects about state changes in another object.

**Encapsulation:** The state change logic is encapsulated in the subject, while the reaction to the state change is encapsulated in the observers.

**Decoupling:** Subjects and observers are loosely coupled, allowing them to vary independently.

**Dynamic Relationships:** Observers can be added or removed at runtime, providing flexibility in managing dependencies.

By using the Observer Pattern, you achieve a more modular and maintainable design, especially useful for systems where multiple objects need to react to state changes or events.