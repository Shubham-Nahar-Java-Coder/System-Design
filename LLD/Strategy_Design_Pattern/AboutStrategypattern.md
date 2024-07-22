# What is Startegy pattern

The Strategy Pattern is a way to define a family of algorithms, encapsulate each one in a separate class, and make them interchangeable. It allows you to choose and change the algorithm that’s used at runtime without changing the code that uses it.

### Key Concepts
**Strategy Interface:** An interface that defines a method for the algorithm or behavior.

**Concrete Strategies:** Classes that implement the Strategy interface, each providing a different way of performing the algorithm.

**Context:** A class that uses a Strategy object to perform the task. The Context class is not responsible for selecting the algorithm; it simply delegates the task to the Strategy object.

# Scenarios Used In:

1. Multiple Algorithms for a Task:
    - When you have multiple ways of performing a specific task and need to switch between these methods dynamically at runtime.
    - Example: Different sorting algorithms (e.g., quicksort, mergesort, bubblesort) that can be selected based on the context.

2. Eliminate Conditional Statements:
    - When your code has many conditional statements (e.g., if-else or switch-case) that select different behaviors or algorithms.
    - Example: A payment system that processes payments through different gateways (e.g., PayPal, credit card, bank transfer).

3. Encapsulate Algorithms:
    - When you want to encapsulate algorithmic logic in separate classes to promote modularity and maintainability.
    - Example: Different strategies for discount calculation in an e-commerce application.

4. Behavioral Extension:
    - When you anticipate that new behaviors or algorithms will be added in the future and want to make the system open to extension but closed to modification.
    - Example: A game character with different attack strategies that can be easily extended with new strategies.

5. Varying Requirements:
    - When different clients of the system need different variations of an algorithm.
    - Example: Different compression algorithms (e.g., zip, gzip, tar) for a file compression utility.

# Summary

**Strategy Pattern** helps you define multiple ways to perform a task and allows you to switch between them easily.

**Encapsulation:** Each algorithm is encapsulated in its own class.

**Flexibility:** You can change the algorithm at runtime without modifying the code that uses it.

By using the Strategy Pattern, you keep your code cleaner, more modular, and easier to maintain.