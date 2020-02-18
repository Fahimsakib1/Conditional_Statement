import java.util.Scanner;
public class Even_Odd_Input_From_User 

{ 
	public static void main(String[] args)
	    {
       Scanner Input= new Scanner (System.in);
       System.out.println("Take an input : ");
       int number = Input.nextInt();
       System.out.println("You have Taken input : " +number);
       
             if (number % 2==0)
                {
    	          System.out.println("Number is even  "); 
    	   
                }
            else
    	          System.out.println("Number is Odd ");
       
       }
}
