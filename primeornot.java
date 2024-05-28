
import java.util.*;
public class primeOrnot 
   {
    public static void main(String[] args)
     {
        int no;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        no=sc.nextInt();
        int count=0;
        for(int i=1;i<=no;i++)
        {
            if(no%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            System.out.println("number is prime"+no);
        }
        else
        {
            System.out.println("no is not prime");
        }
    }   
}