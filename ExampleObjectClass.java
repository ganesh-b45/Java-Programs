public class ExampleObjectClass {

    public static void main(String[] args) {
        // Creating objects of different types
        Object obj1 = new Integer(5);
        Object obj2 = "Hello, World!";
        Object obj3 = new Double(3.14);

        // Using Object class methods
        System.out.println("obj1.toString(): " + obj1.toString());
        System.out.println("obj2.equals(\"Hello, World!\"): " + obj2.equals("Hello, World!"));
        System.out.println("obj3.getClass(): " + obj3.getClass().getName());
    }
}
