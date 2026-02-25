// Main class
public class javabasics {

    // Main method (program starts from here)
    public static void main(String[] args) {

        System.out.println("Hello World"); // Print statement

        System.out.print("Hello "); // Print without new line
        System.out.println("World"); // Print with new line

        // datatype variableName = value;
        int age = 20; // Integer variable
        double price = 99.99; // Decimal variable
        char grade = 'A'; // Single character
        boolean isPass = true; // True or false
        String name = "Shinu"; // Text (String is class)
        int arr[] = { 1, 2, 3 };// Array

        // operations
        int a = 10;
        int b = 5;

        // Arithmetic Operators

        System.out.println(a + b); // Addition (15)
        System.out.println(a - b); // Subtraction (5)
        System.out.println(a * b); // Multiplication (50)
        System.out.println(a / b); // Division (2)
        System.out.println(a % b); // Modulus (0)

        // Relational Operators

        System.out.println(a > b); // true
        System.out.println(a < b); // false
        System.out.println(a == b); // false
        System.out.println(a != b); // true

        // Logical Operators

        boolean x = true;
        boolean y = false;

        System.out.println(x && y); // AND → false
        System.out.println(x || y); // OR → true
        System.out.println(!x); // NOT → false

        // Assignment Operators

        int num = 10;

        num += 5; // num = num + 5
        num -= 2; // num = num - 2
        num *= 3; // num = num * 3

    }
}