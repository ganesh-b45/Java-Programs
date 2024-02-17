import java.util.*;

class SteelException extends RuntimeException{

       public SteelException(String msg){

        super(msg);

     }     

}


public class SteelExceptionApp{

     public static void main(String s[]){

         Scanner sc= new Scanner(System.in);

         System.out.println("Enter the Grade:"); 
         int grd= sc.nextInt();

          try{

                 if(grd == 10){

                   System.out.println("Hardness of Steel must be less than 50");

                   System.out.println("Carbon Content Must be less than 0.7");

                   System.out.println("Tensile Strength must be greter than 5600");
         
                }


             else if(grd == 9){

                  System.out.println("Hardness of Steel must be less than 50");

                  System.out.println("Carbon Content Must be less than 0.7");                  

             }

           else if(grd == 8){

                System.out.println("Carbon Content Must be less than 0.7");

                System.out.println("Tensile Strength must be greter than 5600");
 
           }


          else if(grd == 7){

              System.out.println("Hardness of Steel must be less than 50");

              System.out.println("Tensile Strength must be greter than 5600");
               
          }

         else if(grd == 6){

            System.out.println("Hardness of Steel must be less than 50");

         }


        else{

                 throw new SteelException("No Condition MetException"); 
           }
      
      } 


         catch(SteelException ep){

             System.out.println("\n"+ep);
        }     
    
               

    }

}