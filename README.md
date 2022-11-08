# Factory-Method-design-pattern

- Use the Factory Method when you don’t know beforehand the
  exact types and dependencies of the objects your code should
  work with.

OR

- When you want to add classes with similar functionalities without modifying the existing code

## Architectural diagram

![](img/Untitled.png)
### Explanation:

The Factory Method separates product construction code from
the code that actually uses the product. Therefore, it’s easier to
extend the product construction code independently from the
rest of the code.
For example, to add a new product type to the app, you’ll only
need to create a new creator subclass and override the factory
method in it.