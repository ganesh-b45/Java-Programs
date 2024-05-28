import java.util.Scanner;
class VoterAgeException extends Exception {
    public VoterAgeException(String message) {
        super(message);
    }
}

class EmployeeAgeException extends Exception {
    public EmployeeAgeException(String message) {
        super(message);
    }
}

class OddNumberException extends Exception {
    public OddNumberException(String message) {
        super(message);
    }
}

class DuplicateNumberException extends Exception {
    public DuplicateNumberException(String message) {
        super(message);
    }
}

class NoVowelsException extends Exception {
    public NoVowelsException(String message) {
        super(message);
    }
}

public class UserDefinedExceptionsDemo {

    static void checkVoterEligibility(int age) throws VoterAgeException {
        if (age < 18) {
            throw new VoterAgeException("Voter is not eligible due to age below 18.");
        } else {
            System.out.println("Voter is eligible!");
        }
    }

    static void checkEmployeeEligibility(int age) throws EmployeeAgeException {
        if (age < 21) {
            throw new EmployeeAgeException("Employee is not eligible due to age below 21.");
        } else {
            System.out.println("Employee is eligible!");
        }
    }

    static void checkIfNumberIsOdd(int number) throws OddNumberException {
        if (number % 2 != 0) {
            throw new OddNumberException("Number is odd.");
        } else {
            System.out.println("Number is even.");
        }
    }

    static void checkForDuplicateNumbers(int[] numbers) throws DuplicateNumberException {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    throw new DuplicateNumberException("Array contains duplicate numbers.");
                }
            }
        }
        System.out.println("Array does not contain duplicate numbers.");
    }

    static void checkIfStringContainsVowels(String str) throws NoVowelsException {
        if (!str.matches(".*[aeiouAEIOU].*")) {
            throw new NoVowelsException("String does not contain any vowels.");
        } else {
            System.out.println("String contains vowels.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter voter's age: ");
            int voterAge = scanner.nextInt();
            checkVoterEligibility(voterAge);

            System.out.print("Enter employee's age: ");
            int employeeAge = scanner.nextInt();
            checkEmployeeEligibility(employeeAge);

            System.out.print("Enter a number: ");
            int userNumber = scanner.nextInt();
            checkIfNumberIsOdd(userNumber);

            System.out.print("Enter the size of the array: ");
            int arraySize = scanner.nextInt();
            int[] userNumbers = new int[arraySize];
            System.out.print("Enter array elements: ");
            for (int i = 0; i < arraySize; i++) {
                userNumbers[i] = scanner.nextInt();
            }
            checkForDuplicateNumbers(userNumbers);

            scanner.nextLine(); // consume newline
            System.out.print("Enter a string: ");
            String userString = scanner.nextLine();
            checkIfStringContainsVowels(userString);

        } catch (VoterAgeException | EmployeeAgeException | OddNumberException |
                 DuplicateNumberException | NoVowelsException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}