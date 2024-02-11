package Collection;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Arralist {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        ArrayList<Integer> arrayList = new ArrayList<>();
	        int choice;

	        do {
	            System.out.println("1. Add 10 Values In ArrayList");
	            System.out.println("2. Display All Values In ArrayList");
	            System.out.println("3. Add New Value In ArrayList");
	            System.out.println("4. Search Value In ArrayList");
	            System.out.println("5. Sort All Values In Ascending Order In ArrayList");
	            System.out.println("6. Sort All Values In Descending Order In ArrayList");
	            System.out.println("7. Find Max Value In ArrayList");
	            System.out.println("8. Find Min Value In ArrayList");
	            System.out.println("9. Update Value In ArrayList");
	            System.out.println("10. Delete Value In ArrayList");
	            System.out.println("0. Exit");
	            System.out.print("Enter your choice: ");
	            
	            choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    addTenValues(arrayList);
	                    break;
	                case 2:
	                    displayAllValues(arrayList);
	                    break;
	                case 3:
	                    addNewValue(arrayList, scanner);
	                    break;
	                case 4:
	                    searchValue(arrayList, scanner);
	                    break;
	                case 5:
	                    sortAscending(arrayList);
	                    break;
	                case 6:
	                    sortDescending(arrayList);
	                    break;
	                case 7:
	                    findMaxValue(arrayList);
	                    break;
	                case 8:
	                    findMinValue(arrayList);
	                    break;
	                case 9:
	                    updateValue(arrayList, scanner);
	                    break;
	                case 10:
	                    deleteValue(arrayList, scanner);
	                    break;
	                case 0:
	                    System.out.println("Exiting program. Goodbye!");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please enter a valid option.");
	            }
	        } while (choice != 0);
	        
	        scanner.close();
	    }

	    private static void addTenValues(ArrayList<Integer> arrayList) {
	        for (int i = 1; i <= 10; i++) {
	            arrayList.add(i);
	        }
	        System.out.println("Added 10 values to the ArrayList.");
	    }

	    private static void displayAllValues(ArrayList<Integer> arrayList) {
	        System.out.println("All values in ArrayList: " + arrayList);
	    }

	    private static void addNewValue(ArrayList<Integer> arrayList, Scanner scanner) {
	        System.out.print("Enter the value to add: ");
	        int newValue = scanner.nextInt();
	        arrayList.add(newValue);
	        System.out.println("Added " + newValue + " to the ArrayList.");
	    }

	    private static void searchValue(ArrayList<Integer> arrayList, Scanner scanner) {
	        System.out.print("Enter the value to search: ");
	        int searchValue = scanner.nextInt();
	        if (arrayList.contains(searchValue)) {
	            System.out.println(searchValue + " found in the ArrayList.");
	        } else {
	            System.out.println(searchValue + " not found in the ArrayList.");
	        }
	    }

	    private static void sortAscending(ArrayList<Integer> arrayList) {
	        Collections.sort(arrayList);
	        System.out.println("Sorted ArrayList in ascending order: " + arrayList);
	    }

	    private static void sortDescending(ArrayList<Integer> arrayList) {
	        Collections.sort(arrayList, Collections.reverseOrder());
	        System.out.println("Sorted ArrayList in descending order: " + arrayList);
	    }

	    private static void findMaxValue(ArrayList<Integer> arrayList) {
	        int maxValue = Collections.max(arrayList);
	        System.out.println("Max value in ArrayList: " + maxValue);
	    }

	    private static void findMinValue(ArrayList<Integer> arrayList) {
	        int minValue = Collections.min(arrayList);
	        System.out.println("Min value in ArrayList: " + minValue);
	    }

	    private static void updateValue(ArrayList<Integer> arrayList, Scanner scanner) {
	        System.out.print("Enter the index to update: ");
	        int index = scanner.nextInt();
	        if (index >= 0 && index < arrayList.size()) {
	            System.out.print("Enter the new value: ");
	            int updatedValue = scanner.nextInt();
	            arrayList.set(index, updatedValue);
	            System.out.println("Value at index " + index + " updated to " + updatedValue);
	        } else {
	            System.out.println("Invalid index. Please enter a valid index.");
	        }
	    }

	    private static void deleteValue(ArrayList<Integer> arrayList, Scanner scanner) {
	        System.out.print("Enter the value to delete: ");
	        int deleteValue = scanner.nextInt();
	        if (arrayList.contains(deleteValue)) {
	            arrayList.remove(Integer.valueOf(deleteValue));
	            System.out.println("Deleted " + deleteValue + " from the ArrayList.");
	        } else {
	            System.out.println(deleteValue + " not found in the ArrayList.");
	        }
	    }
	}


