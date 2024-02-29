public class ValidShuffle {

    public static boolean isValidShuffle(String first, String second, String third) {
        int i = 0, j = 0, k = 0;

        while (k < third.length()) {
            // Check if the current character in the third string matches the character from the first string
            if (i < first.length() && first.charAt(i) == third.charAt(k)) {
                i++;
            }
            // Check if the current character in the third string matches the character from the second string
            else if (j < second.length() && second.charAt(j) == third.charAt(k)) {
                j++;
            }
            // If neither match, the third string is not a valid shuffle
            else {
                return false;
            }

            k++;
        }

        // Check if both the first and second strings are fully consumed
        return i == first.length() && j == second.length();
    }

    public static void main(String[] args) {
        String first = "abc";
        String second = "def";
        String third1 = "dabecf"; // Valid shuffle
        String third2 = "dbaecf"; // Not a valid shuffle

        System.out.println("Is \"" + third1 + "\" a valid shuffle? " + isValidShuffle(first, second, third1));
        System.out.println("Is \"" + third2 + "\" a valid shuffle? " + isValidShuffle(first, second, third2));
    }
}
