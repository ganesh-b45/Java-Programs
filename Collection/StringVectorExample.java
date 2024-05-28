import java.util.Vector;

public class StringVectorExample {
    public static void main(String[] args) {
        // Create a Vector of strings
        Vector<String> stringVector = new Vector<>();

        // Add string values to the Vector
        stringVector.add("Good");
        stringVector.add("Bad");
        // Add more string values to make a total of 10
        stringVector.add("Hello");
        stringVector.add("World");
        stringVector.add("Java");
        stringVector.add("Programming");
        stringVector.add("Vector");
        stringVector.add("Example");
        stringVector.add("String");
        stringVector.add("Count");

        // Display character count at each index
        System.out.println("Index \t Character Count");
        displayCharacterCount(stringVector);
    }

    private static void displayCharacterCount(Vector<String> vector) {
        for (int i = 0; i < vector.size(); i++) {
            String element = vector.get(i);
            int characterCount = element.length();
            System.out.println(i + "\t -------------------- > " + characterCount);
        }
    }a
}
