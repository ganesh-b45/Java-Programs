public class StringOperationsExample {

    public static void main(String[] args) {
        // Creating strings using different constructors
        String literalString = "Hello, World!";
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String fromCharArray = new String(charArray);
        String subString = new String(charArray, 0, 2);
        byte[] byteArray = {72, 101, 108, 108, 111}; // ASCII values for "Hello"
        String fromBytes = new String(byteArray, StandardCharsets.UTF_8);
        String emptyString = new String();

        // Concatenating strings
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;

        // Using StringBuilder
        StringBuilder stringBuilder = new StringBuilder("Hello");
        String fromStringBuilder = new String(stringBuilder);

        // Using String.format
        String formattedString = String.format("Hello, %s!", "John");

        // String length
        int length = literalString.length();

        // String comparison
        boolean isEqual = literalString.equals(fromCharArray);

        // String case conversion
        String uppercaseString = literalString.toUpperCase();
        String lowercaseString = literalString.toLowerCase();

        // Substring
        String substringExample = literalString.substring(0, 5);

        // Displaying results
        System.out.println("Literal String: " + literalString);
        System.out.println("String from Char Array: " + fromCharArray);
        System.out.println("Substring from Char Array: " + subString);
        System.out.println("String from Bytes: " + fromBytes);
        System.out.println("Empty String: " + emptyString);
        System.out.println("Concatenated Full Name: " + fullName);
        System.out.println("String from StringBuilder: " + fromStringBuilder);
        System.out.println("Formatted String: " + formattedString);
        System.out.println("String Length: " + length);
        System.out.println("Are strings equal? " + isEqual);
        System.out.println("Uppercase String: " + uppercaseString);
        System.out.println("Lowercase String: " + lowercaseString);
        System.out.println("Substring Example: " + substringExample);
    }
}
