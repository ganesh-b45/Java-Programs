import java.util.*;

public class StackApplication {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		Stack s = new Stack();
		int choice, value;

		do {
			System.out.println("1:PUSH element In Stack");
			System.out.println("2:View All Elements From Stack");
			System.out.println("3:Display elements of Stack");
			System.out.println("Enter your choice");
			choice = xyz.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter data in stack");
				value = xyz.nextInt();
				s.push(value);
				break;
			case 2:
				boolean b = s.isEmpty();
				if (b) {
					System.out.println("Stack is empty");
				} else {
					System.out.println("Remove value is " + s.pop());
				}
				break;
			case 3:
				b = s.empty();
				if (b) {
					System.out.println ("There is no element");
				} else {
					ListIterator li = s.listIterator(s.size());
					while (li.hasPrevious()) {
						Object obj = li.previous();
						System.out.println(obj);
					}
				}
				break;
			case 4:
				System. exit(0);
				break;
			default:
				System.out.println ("Wrong choice");
			}
		} while (true);
	}
}
