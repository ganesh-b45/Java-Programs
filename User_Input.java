import java.util.*;
public class User_Input
 {
   public static void main(String[] args) {
    int id,per;
    String name;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the id");
    id=sc.nextInt();
    System.out.println("Enter the per");
    per=sc.nextInt();
    System.out.println("Enter the name");
    name=sc.nextLine();
    System.out.println("the id is"+id);
    System.out.println("the name is"+name);
    System.out.println("the per is"+per);
   }  
}