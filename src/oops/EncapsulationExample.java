package oops;

//Encapsulation example: Creating a class with private data members and public methods to access them

class Person {
 private String name;
 private int age;

 // Constructor to initialize name and age
 public Person(String name, int age) {
     this.name = name;
     this.age = age;
 }

 // Getter method for name
 public String getName() {
     return name;
 }

 // Setter method for age
 public void setAge(int age) {
     this.age = age;
 }

 // Method to display person's information
 public void displayInfo() {
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
 }
}

public class EncapsulationExample {
 public static void main(String[] args) {
     // Creating a Person object
     Person person1 = new Person("John", 30);

     // Accessing name using getter method
     System.out.println("Name: " + person1.getName());

     // Updating age using setter method
     person1.setAge(35);

     // Displaying person's information
     person1.displayInfo();
 }
}
