import java.util.Scanner;

public class ArmstrongNumberChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isArmstrongNumber(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        scanner.close();
    }

    // Function to check if a number is an Armstrong number
    static boolean isArmstrongNumber(int num) {
        int originalNumber, remainder, result = 0, n = 0;

        // Assigning the value of num into originalNumber
        originalNumber = num;

        // Counting the number of digits in originalNumber
        while (originalNumber != 0) {
            originalNumber /= 10;
            ++n;
        }

        // Assigning the value of num into originalNumber again
        originalNumber = num;

        // Computing the result
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
            originalNumber /= 10;
        }

        // Checking if num is equal to the result
        return result == num;
    }
}
