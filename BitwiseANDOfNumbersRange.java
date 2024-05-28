public class BitwiseANDOfNumbersRange {

    public static int rangeBitwiseAnd(int left, int right) {
        int shift = 0;
        
        // Find the common leftmost bits in binary representation of left and right
        while (left < right) {
            left >>= 1;
            right >>= 1;
            shift++;
        }
        
        // Shift back to the right to get the final result
        return left << shift;
    }

    public static void main(String[] args) {
        int left = 5;
        int right = 7;
        System.out.println("Bitwise AND of Numbers Range: " + rangeBitwiseAnd(left, right));
    }
}
