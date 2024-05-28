import java.util.Scanner;

public class TwoDArray{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the dimensions of the array
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Creating a 2D array based on user input
        int[][] userInputArray = new int[rows][columns];

        // Taking user input for each element of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                userInputArray[i][j] = scanner.nextInt();
            }
        }

        //displayArray("User Input Array", userInputArray);
		        displayArray( userInputArray);

        scanner.close();
    }

   // private static void displayArray(String name, int[][] array) 
	private static void displayArray(int[][] array) {
       // System.out.println(name + ":");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}
