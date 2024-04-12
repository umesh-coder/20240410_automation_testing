package oops;

//Polymorphism example: Demonstrating method overriding

class Animal {
 public void makeSound() {
     System.out.println("Animal is making a sound");
 }
}

class Dog extends Animal {
 // Overriding makeSound method of superclass
 @Override
 public void makeSound() {
     System.out.println("Dog is barking");
 }
}

public class PolymorphismExample {
 public static void main(String[] args) {
     // Creating Animal and Dog objects
     Animal animal = new Animal();
     Dog dog = new Dog();

     // Calling makeSound method for both objects
     animal.makeSound(); // Output: Animal is making a sound
     dog.makeSound();    // Output: Dog is barking
 }
}
