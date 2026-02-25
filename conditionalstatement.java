public class conditionalstatement {
    public static void main(String[] args) {

        int number = 10;
        int marks = 75;
        int age = 20;
        boolean hasID = true;

        // 1️⃣ Simple if
        if (number > 0) { // Check if number is positive
            System.out.println("Number is positive");
        }

        // 2️⃣ if-else
        if (number % 2 == 0) { // Check even or odd
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }

        // 3️⃣ else-if ladder
        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 70) {
            System.out.println("Grade B");
        } else if (marks >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }

        // 4️⃣ Nested if (if inside if)
        if (age >= 18) { // First condition
            if (hasID) { // Second condition
                System.out.println("Allowed to enter");
            }
        }

    }
}