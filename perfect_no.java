import java.util.*;

import javafx.scene.transform.Scale;

public class perfect_no {
    public static void main(String[] args) {
        int no,sum=0,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no");
        no=sc.nextInt();
        for( i=1;i<no;i++)
        {
            if (no%i==0) 
            {
                sum=sum+i;
            }
        }
        if (sum==no)
         {
            System.out.println("%d is a perfect number"+no);
        }
        else
        {
            System.out.println("no is not perfect");
        }
    }
}
