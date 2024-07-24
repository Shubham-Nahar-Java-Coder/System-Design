# What is Factory pattern

The Factory Pattern is a design pattern used to create objects without specifying the exact class of the object that will be created. Instead, a method is used to create the object, which allows the actual creation process to be deferred to subclasses.

### Key Components
**Factory Method:** A method used to create objects. This method is defined in a superclass but is implemented by subclasses.

**Product:** The interface or abstract class representing the objects created by the factory method.

**Concrete Product:** A specific implementation of the Product interface.

**Creator:** The class or interface that declares the factory method, which returns a Product object.

**Concrete Creator:** A subclass of Creator that implements the factory method to return a Concrete Product.

# Scenarios Used In:

### 1. Decoupling Object Creation:
    - When the exact type of object to create is determined at runtime.
    - Example: A GUI toolkit that creates different UI elements like buttons and menus based on user input.

### 2. Centralizing Object Creation:
    - When creating objects involves complex logic or configurations.
    - Example: A document editor that can create different types of documents (text, spreadsheet, presentation) based on user selection.

### 3. Handling Product Variations:
    - When there are multiple variations of a product, and the client code should work with any variation.
    - Example: A logistics application that creates different types of transport vehicles (truck, ship, airplane) depending on the delivery type.

### 4. Deferring Instantiation:
    - When you want to delay creating objects until runtime.
    - Example: A plugin system where the application can load and create plugins dynamically.

### 5. Managing Dependencies:
    - When you need to manage and inject dependencies into created objects.
    - Example: A web framework that uses factories to inject dependencies into controllers or services.

# Summary

**Factory Pattern** helps you create objects without specifying their exact class.

**Encapsulation:** The creation logic is kept within the factory method, making the code cleaner and easier to manage.

**Decoupling:** The client code is not tied to specific classes, making the system more flexible and reusable.

**Polymorphism:** Factory methods can use polymorphism to create different types of objects without changing the client code.

Using the Factory Pattern makes your design more modular and easier to maintain, especially when you need to create objects with different types and dependencies at runtime.