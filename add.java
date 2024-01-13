
import java.util.*;
public class add{
    public static void main(String[] args) {
        int a[]=new int[5] ;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements in array");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("elements are");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
