import java.util.Scanner;
public class Legest_Number_Input_By_User 
{
        public static void main (String[] args)
	   {
		Scanner input = new Scanner (System.in);
        
		int Highest;
		System.out.println (" Take 1st Input : " );
		int Number1 = input.nextInt();
		
        System.out.println (" Take 2nd Input : " );
		int Number2 = input.nextInt();
		
	    System.out.println (" Take 3rd Input : " );
		int Number3 = input.nextInt();
		
		
		
		if (Number1 > Number2)
		{
			if (Number1 > Number3)
			{
			Highest = Number1;
			}
			else
			{
				Highest =Number3;
			}
		}
	
		else {
			 
			if ( Number2 > Number3)
			{
				Highest =Number2;
			}
			else
			{
				Highest = Number3;
			}

		}
		System.out.println (" Largset number is : " + Highest );
		
	}
}
