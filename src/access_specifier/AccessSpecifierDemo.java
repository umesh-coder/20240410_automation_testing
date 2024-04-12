package access_specifier;

//Define a class named AccessSpecifierDemo
public class AccessSpecifierDemo {
 
 // Private member variable
 private int privateVar;
 
 // Public member variable
 public int publicVar;
 
 // Protected member variable
 protected int protectedVar;
 
 // Default (package-private) member variable
 int defaultVar;
 
 // Constructor
 public AccessSpecifierDemo() {
     privateVar = 1;
     publicVar = 2;
     protectedVar = 3;
     defaultVar = 4;
 }
 
 // Method to demonstrate accessing private member
 // This method can access privateVar directly because it's within the same class
 public void accessPrivateVar() {
     System.out.println("Private variable value: " + privateVar);
 }
 
 // Main method
 public static void main(String[] args) {
     // Create an object of AccessSpecifierDemo class
     AccessSpecifierDemo obj = new AccessSpecifierDemo();
     
     // Accessing publicVar directly as it's public
     System.out.println("Public variable value: " + obj.publicVar);
     
     // Accessing protectedVar directly as it's in the same package
     System.out.println("Protected variable value: " + obj.protectedVar);
     
     // Accessing defaultVar directly as it's in the same package
     System.out.println("Default variable value: " + obj.defaultVar);
     
     // Accessing privateVar indirectly through a method
     obj.accessPrivateVar();
 }
}
