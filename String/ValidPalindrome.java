public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char leftChar = Character.toLowerCase(s.charAt(left));
            char rightChar = Character.toLowerCase(s.charAt(right));

            if (Character.isLetterOrDigit(leftChar) && Character.isLetterOrDigit(rightChar)) {
                if (leftChar != rightChar) {
                    return false;
                }
                left++;
                right--;
            } else {
                if (!Character.isLetterOrDigit(leftChar)) {
                    left++;
                }
                if (!Character.isLetterOrDigit(rightChar)) {
                    right--;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama";
        System.out.println("Is \"" + s1 + "\" a valid palindrome? " + isPalindrome(s1));

        String s2 = "race a car";
        System.out.println("Is \"" + s2 + "\" a valid palindrome? " + isPalindrome(s2));
    }
}
