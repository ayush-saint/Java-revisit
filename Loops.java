public class Loops {
    public static void main(String[] args) {

        // 1️⃣ For Loop
        // Used when number of iterations is known

        System.out.println("For Loop:");
        for (int i = 1; i <= 5; i++) { // Start=1, Condition<=5, Increment
            System.out.println(i); // Prints 1 to 5
        }

        // 2️⃣ While Loop
        // Used when condition is checked first

        System.out.println("While Loop:");
        int j = 1;

        while (j <= 5) { // Condition checked first
            System.out.println(j);
            j++; // Increment
        }

        // 3️⃣ Do-While Loop
        // Executes at least one time

        System.out.println("Do-While Loop:");
        int k = 1;

        do {
            System.out.println(k);
            k++; // Increment
        } while (k <= 5); // Condition checked after execution

    }
}