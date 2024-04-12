package oops;

//Inheritance example: Creating a superclass and multiple subclasses to demonstrate inheritance

//Superclass
class Vehicle {
 private String brand;
 private String model;

 // Constructor
 public Vehicle(String brand, String model) {
     this.brand = brand;
     this.model = model;
 }

 // Getter methods
 public String getBrand() {
     return brand;
 }

 public String getModel() {
     return model;
 }

 // Method to display vehicle information
 public void displayInfo() {
     System.out.println("Brand: " + brand);
     System.out.println("Model: " + model);
 }
}

//Subclass Car
class Car extends Vehicle {
 private int numberOfDoors;

 // Constructor
 public Car(String brand, String model, int numberOfDoors) {
     super(brand, model);
     this.numberOfDoors = numberOfDoors;
 }

 // Method to display car information
 public void displayCarInfo() {
     displayInfo(); // Invoking method from superclass
     System.out.println("Number of doors: " + numberOfDoors);
 }
}

//Subclass Motorcycle
class Motorcycle extends Vehicle {
 private boolean hasSideCar;

 // Constructor
 public Motorcycle(String brand, String model, boolean hasSideCar) {
     super(brand, model);
     this.hasSideCar = hasSideCar;
 }

 // Method to display motorcycle information
 public void displayMotorcycleInfo() {
     displayInfo(); // Invoking method from superclass
     System.out.println("Has sidecar: " + hasSideCar);
 }
}

public class InheritanceExample {
 public static void main(String[] args) {
     // Creating objects of Car and Motorcycle
     Car car = new Car("Toyota", "Camry", 4);
     Motorcycle motorcycle = new Motorcycle("Honda", "CBR500R", false);

     // Displaying information for Car
     System.out.println("Car Information:");
     car.displayCarInfo();
     System.out.println();

     // Displaying information for Motorcycle
     System.out.println("Motorcycle Information:");
     motorcycle.displayMotorcycleInfo();
 }
}
