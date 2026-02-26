public class VarArgs {

    /*
     * Varargs (Variable Arguments)
     * -----------------------------
     * int... numbers means:
     * - Method can accept 0 or more integers
     * - Inside the method, numbers behaves like an array (int[])
     */

    public static int sum(int... numbers) {

        int total = 0;

        // numbers is treated like an array
        for (int num : numbers) {
            total += num;
        }

        return total;
    }

    public static void main(String[] args) {

        // Different ways to call varargs method

        System.out.println(sum());            // 0 arguments
        System.out.println(sum(5));           // 1 argument
        System.out.println(sum(1, 2, 3));     // 3 arguments
        System.out.println(sum(10, 20, 30, 40)); // 4 arguments
    }
}