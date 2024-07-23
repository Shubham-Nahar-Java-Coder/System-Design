# What is Decorator pattern

The Decorator Pattern is a design pattern that lets you add new behaviors to objects without changing their original code. It’s a way to extend the functionality of objects in a flexible and reusable manner.

### Key Components
**Component:** The main interface or abstract class that defines the basic operations. 

**Concrete Component:**  The actual class that implements the Component interface and has the core functionality.

**Decorator:** The abstract class or interface that wraps a Component object and has the same interface as the Component.

**Concrete Decorator:** The class that extends the Decorator and adds extra behavior to the Component.

# Scenarios Used In:

1. Extending Functionality at Runtime:
    - When you need to add responsibilities to objects dynamically and transparently.
    - Example: Adding scrollbars to a window dynamically in a graphical user interface.

2. Combining Behaviors:
    - When you need to combine multiple behaviors in a flexible and reusable way.
    - Example: Adding borders, shadows, and scrolling functionality to UI components independently.

3. Alternative to Subclassing:
    - When subclassing for every possible combination of behaviors is impractical.
    - Example: Instead of creating separate subclasses for different types of beverages (e.g., Mocha, Latte) with various toppings, decorators can be used to add toppings dynamically.

4. Single Responsibility Principle:
    - When you want to adhere to the Single Responsibility Principle by allowing classes to focus on their primary functionality.
    - Example: A text editor where core text editing is separated from additional features like spell checking and auto-completion.

5. Enhancing Immutable Objects:
    - When working with immutable objects, and you need to create new objects with enhanced behavior without modifying the original object.
    - Example: Enhancing the behavior of a basic logger with additional features like logging to a file, formatting, and filtering.

# Summary

**Decorator Pattern** allows you to dynamically attach additional responsibilities to an object, providing a flexible mechanism for extending functionality.

**Transparency:** Additional behavior can be added transparently without altering the object's interface.

**Flexibility:** Allows for the combination of behaviors in a flexible and reusable way, adhering to the Single Responsibility Principle.

**Dynamic Behavior:** Supports the addition of behavior at runtime, making it ideal for situations where extension through inheritance is not practical.

By using the Decorator Pattern, you can achieve a more modular, flexible, and maintainable design, especially useful for applications where objects need to exhibit various behaviors dynamically and transparently.