package oops;

//Abstraction example: Using abstract class

//Abstract class
abstract class Shape {
 // Abstract method to calculate area
 public abstract double calculateArea();
}

//Concrete subclass implementing the abstract method
class Circle extends Shape {
 private double radius;

 // Constructor
 public Circle(double radius) {
     this.radius = radius;
 }

 // Implementing the abstract method to calculate area
 @Override
 public double calculateArea() {
     return Math.PI * radius * radius;
 }
}

public class AbstractionExample {
 public static void main(String[] args) {
     // Creating a Circle object
     Circle circle = new Circle(5);

     // Calculating and printing area
     System.out.println("Area of the circle: " + circle.calculateArea());
 }
}
