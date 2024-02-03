import java.util.*;

class palindrome1{
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int n = s.length(); 

        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) 
                return false;
        }
        return true;
    }

    public static void main(String args[]) {
        palindrome1 obj = new palindrome1();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the no");
        int number = sc.nextInt(); // Read an integer instead of a string
        boolean result = obj.isPalindrome(number); // Passing the integer to the method
        System.out.println("The number is palindrome: " + result);
    }
}
