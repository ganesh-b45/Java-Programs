public class ReverseInteger {
    public int reverse(int x) {
        int result = 0;

        while (x != 0) {
            // Check for overflow before updating result
            if (result > Integer.MAX_VALUE / 10 || result < Integer.MIN_VALUE / 10) {
                return 0;
            }

            // Update result by adding the last digit of x
            result = result * 10 + x % 10;
            // Remove the last digit from x
            x /= 10;
        }

        return result;
    }

    public static void main(String[] args) {
        ReverseInteger solution = new ReverseInteger();

        // Example usage:
        int num1 = 123;
        int result1 = solution.reverse(num1);
        System.out.println("Reverse of " + num1 + ": " + result1);

        int num2 = -123;
        int result2 = solution.reverse(num2);
        System.out.println("Reverse of " + num2 + ": " + result2);

        int num3 = 120;
        int result3 = solution.reverse(num3);
        System.out.println("Reverse of " + num3 + ": " + result3);
    }
}
