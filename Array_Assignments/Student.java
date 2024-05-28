import java.util.Arrays;
import java.util.Scanner;

class Student {
    int roll;
    String name;
    int sub1, sub2, sub3, sub4, sub5;

    public Student(int roll, String name, int sub1, int sub2, int sub3, int sub4, int sub5) {
        this.roll = roll;
        this.name = name;
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.sub4 = sub4;
        this.sub5 = sub5;
    }

    public int getTotalMarks() {
        return sub1 + sub2 + sub3 + sub4 + sub5;
    }

    public boolean passedAllSubjects() {
        return sub1 >= 40 && sub2 >= 40 && sub3 >= 40 && sub4 >= 40 && sub5 >= 40;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int num_students = 5;
        Student[] students = new Student[num_students];

        // Accepting student information
        for (int i = 0; i < num_students; ++i) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Roll: ");
            int roll = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Marks in subject 1: ");
            int sub1 = scanner.nextInt();
            System.out.print("Marks in subject 2: ");
            int sub2 = scanner.nextInt();
            System.out.print("Marks in subject 3: ");
            int sub3 = scanner.nextInt();
            System.out.print("Marks in subject 4: ");
            int sub4 = scanner.nextInt();
            System.out.print("Marks in subject 5: ");
            int sub5 = scanner.nextInt();

            students[i] = new Student(roll, name, sub1, sub2, sub3, sub4, sub5);
        }

        // Sorting students array in descending order of total marks
        Arrays.sort(students, (a, b) -> b.getTotalMarks() - a.getTotalMarks());

        // Finding and displaying the topper who passed in all subjects
        for (Student student : students) {
            if (student.passedAllSubjects()) {
                System.out.println("Topper who passed in all subjects: " + student.name);
                System.out.println("Roll: " + student.roll);
                System.out.println("Total Marks: " + student.getTotalMarks());
                break;
            }
        }
    }
}
