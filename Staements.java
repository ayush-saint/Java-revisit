public class Staements {
    public static void main(String[] args) {

        int day = 2;
        int category = 1;
        int choice = 1;

        // 1️⃣ Simple Switch Statement
        System.out.println("Simple Switch:");
        switch (day) {
            case 1:
                System.out.println("Monday");
                break; // Stops execution
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid Day");
        }

        // 2️⃣ Nested Switch Statement
        System.out.println("Nested Switch:");
        switch (category) {

            case 1:
                System.out.println("Electronics");

                switch (choice) { // Inner switch
                    case 1:
                        System.out.println("Mobile");
                        break;
                    case 2:
                        System.out.println("Laptop");
                        break;
                    default:
                        System.out.println("Invalid Choice");
                }
                break;

            case 2:
                System.out.println("Clothing");
                break;

            default:
                System.out.println("Invalid Category");
        }

        // 3️⃣ Enhanced Switch (Java 14+)
        System.out.println("Enhanced Switch:");
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            default -> System.out.println("Invalid Day");
        }

    }
}