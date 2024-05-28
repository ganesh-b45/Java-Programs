public class SubstringCheck {
    public static void findSubstringIndices(String str, String sub) {
        int position = str.indexOf(sub);

        if (position != -1) {
            System.out.printf("Given substring is present between %d and %d index.%n", position, position + sub.length() - 1);
        } else {
            System.out.println("Given substring is not present.");
        }
    }

    public static void main(String[] args) {
        String str1 = "India is my country";
        String sub1 = "my";

        String str2 = "I am working in IT industry";
        String sub2 = "working as";

        System.out.println("Example 1:");
        findSubstringIndices(str1, sub1);

        System.out.println("\nExample 2:");
        findSubstringIndices(str2, sub2);
    }
}
