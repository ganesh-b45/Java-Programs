class SubstringExample {
    public static void main(String[] args) {
        
        String originalString = "Hello, world!";

        
        String substringToFind = "world";

        // findthe index of the substring
        int index = originalString.indexOf(substringToFind);

       
        if (index != -1) {
            System.out.println("Substring found at index: " + index);
        } else {
            System.out.println("Substring not found");
        }
    }
}
