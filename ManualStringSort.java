public class ManualStringSort {
    public static void main(String[] args) {
        String originalString = "programming";
        String sortedString = sortString(originalString);
        
        System.out.println("Original String: " + originalString);
        System.out.println("Sorted String: " + sortedString);
    }

    private static String sortString(String str) {
        char[] charArray = str.toCharArray();
        int n = charArray.length;

        // Bubble sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (charArray[j] > charArray[j + 1]) {
                    // Swap characters
                    char temp = charArray[j];
                    charArray[j] = charArray[j + 1];
                    charArray[j + 1] = temp;
                }
            }
        }

        return new String(charArray);
    }
}
