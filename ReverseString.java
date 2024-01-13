public class ReverseString{
    public static void main(String[] args) {
        // Input string
        String originalString = "Good Morning India";

        // Convert the string to a character array
        char[] charArray = originalString.toCharArray();

        // Calculate the length of the array
        int length = charArray.length;

        // Reverse the array
        for (int i = 0; i < length / 2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[length - i - 1];
            charArray[length - i - 1] = temp;
        }

        // Convert the character array back to a string
        String reversedString = new String(charArray);

        // Displaying the reversed string
        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversedString);
    }
}
