class ArrayListProgram {

    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = {1, 2, 3, 4, 5};

        // Print the elements of the array
        System.out.println("Original array:");
        printArray(numbers);

        // Access and modify elements in the array
        numbers[2] = 10;

        // Print the modified array
        System.out.println("\nArray after modification:");
        printArray(numbers);

        // Calculate and print the sum of elements in the array
        int sum = calculateSum(numbers);
        System.out.println("\nSum of array elements: " + sum);
    }

    // Method to print the elements of an array
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Method to calculate the sum of elements in an array
    private static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
