# Crafting Cocktails in Java

## Deadline
This work is due by the end of the next class period.

## Instructions
For specific information on how to complete this assignment and submit it, please refer to the assignments section of the course portal.

## Preparation
- Complete and answer all questions in "Understanding Objects and Classes in Java" from the course material.
- Review the relevant sections on classes, objects, constructors, and methods in the Java documentation or any standard Java programming book.

## Learning Goals
This assignment will help reinforce the following key concepts:
* Understanding and designing Java classes
* Implementing instance fields
* Understanding constructors in Java
* Creating and using getters and setters
* Employing the dot notation for accessing object properties
* Basic usage of the `main` method
* Understanding scope and variable shadowing

## Assignment

Imagine you're working as a JAVA Developer at a high-end bar. The owner, inspired by the digital transformation wave, desires a software solution to model their cocktail recipes digitally. Your task is to model these cocktails using Java! They believe this innovative approach will enhance their ability to craft, customize, and recommend cocktails based on customer preferences.

### Exercise 1: Data Modeling

Initiate your journey by creating a new Java file named `Cocktail.java` within the `src` folder. This file should define the `Cocktail` class. 

In this first step, define your `Cocktail` class with the following characteristics as instance fields:
- `String` name
- `String` mainIngredient
- `int` volumeInMl
- `boolean` isAlcoholic
- `double` price

After defining the class, proceed to craft your very first cocktail. Add the main method provided in the example below to your `Cocktail` class and instantiate a `Cocktail` object within it:

### Exercise 2: Creating More Cocktails

After successfully modeling your first cocktail, explore the wide variety of cocktails by creating two more, making a total of three. 

You may realize this method is not scalable if you want to add many cocktails. We will address this by using Java's object-oriented features like constructors and encapsulation in the following exercises.

### Exercise 3: Encapsulation with Getters and Setters

Time to add some privacy! Change the access modifiers of instance fields in your `Cocktail` class to `private`. This encapsulates the data and prevents direct modifications from outside the class.

To allow controlled access to these fields, implement getter and setter methods for each field. Remember to follow Java naming conventions (`getXXX` and `setXXX` where `XXX` is the name of the field).

### Exercise 4: Constructors Are Here!

Creating cocktails one step at a time is cumbersome. Simplify this process by creating a constructor for the `Cocktail` class. The constructor should take arguments for each field of the class and assign them accordingly.

This allows you to create new `Cocktail` objects while specifying their attributes at the time of creation.

### Exercise 5: Array of Cocktails

Craft a collection of your favorite cocktails by creating an array of `Cocktail` objects. Demonstrate how to populate this array with different cocktails, showcasing the variety and flexibility of using objects.

### Exercise 6: Displaying Cocktail Information

For each cocktail, it is crucial to display its information clearly. Implement a method called `displayInfo()` within the `Cocktail` class. This method should print all information about the cocktail to the terminal.

### Exercise 7: Cocktail Customization

Imagine a customer wants their cocktail to be a bit stronger or sweeter. Implement a method named `customizeCocktail(String ingredient, int volumeChange)` that allows customization of the main ingredient or the volume of the cocktail. This method should reflect the changes in the object's state and print a message indicating the customization has been applied.

## Understanding Scope and Variable Shadowing

Reflect on the concepts of scope and variable shadowing through practical examples. Review and understand how local variables in methods can shadow class fields and how to overcome this using the `this` keyword.

## Checklist
- Create and detail the Cocktail class with appropriate fields.
- Implement encapsulation by using private access modifiers and providing getters and setters.
- Define and use a constructor to simplify object creation.
- Explore creating an array of objects for more complex data manipulation.
- Demonstrate the ability to modify object states through custom methods.
- Understand and apply the concepts of scope and the significance of the `this` keyword.

## Feedback and Assistance
If you encounter difficulties, consult the documentation provided, reach out for peer advice, or seek instructor guidance during office hours. Remember, understanding these foundational concepts is crucial for your journey as a Java developer.
