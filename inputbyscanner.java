import java.util.Scanner; // Import Scanner

public class inputbyscanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter your name: ");
        String name = sc.nextLine(); // Take String input

        System.out.print("Enter your age: ");
        int age = sc.nextInt(); // Take integer input

        System.out.println("Name: " + name); // Print name
        System.out.println("Age: " + age); // Print age

        sc.close(); // Close scanner (good practice)
    }
}