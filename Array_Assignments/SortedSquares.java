import java.util.Arrays;

public class SortedSquares {
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = nums[i] * nums[i];
        }

        Arrays.sort(result);

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};

        int[] result = sortedSquares(nums);

        System.out.println(Arrays.toString(result));
    }
}
