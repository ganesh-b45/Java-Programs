import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {

    public static int firstUniqChar(String s) {
        // Createing  a HashMap to store the frequency of each character
        Map<Character, Integer> charFreq = new HashMap<>();

        // Iterating through the string and update the character frequency
        for (char c : s.toCharArray()) {
            charFreq.put(c, charFreq.getOrDefault(c, 0) + 1);
        }

        // again Iterating through the string to find the first unique character
        for (int i = 0; i < s.length(); i++) {
            if (charFreq.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        // If there is no unique character found, return -1
        return -1;
    }

    public static void main(String[] args) {
        
        String s1 = "programming ";
        System.out.println(" found at index :"+firstUniqChar(s1));  

        String s2 = "concept";
        System.out.println(" found at index :"+firstUniqChar(s2));  

        String s3 = "aabb";
        System.out.println(" found at index :"+firstUniqChar(s3));  
    }
}
