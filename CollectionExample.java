import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {
        // Creating a List
        List<String> stringList = new ArrayList<>();

        // Adding elements
        stringList.add("Java");
        stringList.add("Python");
        stringList.add("C++");

        // Checking size
        System.out.println("Size of the list: " + stringList.size());

        // Checking if empty
        System.out.println("Is the list empty? " + stringList.isEmpty());

        // Accessing elements using iterator
        System.out.println("Elements in the list:");
        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Removing an element
        stringList.remove("Python");

        // Checking containment
        System.out.println("Does the list contain 'Python'? " + stringList.contains("Python"));

        // Converting to array
        Object[] array = stringList.toArray();
        System.out.println("Array representation of the list:");
        for (Object element : array) {
            System.out.println(element);
        }

        // Sorting (for Lists)
        Collections.sort(stringList);
        System.out.println("Sorted list:");
        for (String element : stringList) {
            System.out.println(element);
        }

        // Creating a sublist
        List<String> sublist = stringList.subList(0, 2);
        System.out.println("Sublist:");
        for (String element : sublist) {
            System.out.println(element);
        }

        // Clearing the list
        stringList.clear();

        // Checking if empty after clearing
        System.out.println("Is the list empty after clearing? " + stringList.isEmpty());
    }
}
