import java.util.Scanner;
public class Grade_Calculation_Input_Given_By_User 

{
     public static void main (String[] args )
	   {
		Scanner input = new Scanner(System.in);
	    //int number = input.nextInt();
	   // System.out.println(" take an input : " + number);
	    System.out.print(" take an input : ");
	    int number = input.nextInt();
	    System.out.println(" your  input is : " + number);
		
		if ( number >=90 && number <=100 )
		{
			
		System.out.println(" Grade is A+ with number " + number);
		}
		
		if ( number >=85 && number <90 )
		{
			
		System.out.println(" Grade is A with number " + number);
		}
		
		if ( number >=80 && number <85 )
		{
			
		System.out.println(" Grade is B+ with number " + number);
		}
		
		if ( number >=75 && number <80 )
		{
			
		System.out.println(" Grade is B with number " + number);
		}
		
		if ( number >=70 && number <75 )
		{
			
		System.out.println(" Grade is C+ with number " + number);
		}
		
		if ( number >=65 && number <70 )
		{
			
		System.out.println(" Grade is C with number " + number);
		}
		
		if ( number >=60 && number <65 )
		{
			
		System.out.println(" Grade is D+ with number " + number);
		}
		
		if ( number >=50 && number <60 )
		{
			
		System.out.println(" Grade is D with number " + number);
		}
		
		if ( number >=0 && number <50 )
		{
			
		System.out.println(" Grade is F with number " + number);
		}
	}
}


