import  java.util.Scanner;
public class Grade_Calculate_By_Switch_Case 

{
  public static void main (String[] args )
  
  {
	      
	    Scanner input = new Scanner (System.in);
	    
	    System.out.println(" take an input : ");
	    int number = input.nextInt();
	    System.out.println(" your  input is : " + number);
	 
	    
		
	    switch (number)
	  
	    {
	    //char 'A+','A','B+','B','C+','C','D+','D','F';
	    case 1 :
	    	
	    if ( number >=90 && number <=100 )
		
	    {	
		System.out.println(" Grade is A+ with number " + number);
		break;
	    }
		
		
	    case 2:
	    
	    if ( number >=85 && number <90 )
		
	    {	
		System.out.println(" Grade is A with number " + number);
		break;
	    }
		
	    
	    
	    case 3 :
		if ( number >=80 && number <85 )
		{
			
		System.out.println(" Grade is B+ with number " + number);
		break;
		}
		
		
		
	    case 4 :
		if ( number >=75 && number <80 )
		{
			
		System.out.println(" Grade is B with number " + number);
		break;
		}
		
		
	    case 5 :
		if ( number >=70 && number <75 )
		{	
		System.out.println(" Grade is C+ with number " + number);
		break;
		}
		
		
	    case 6 :
		if ( number >=65 && number <70 )
		{
			
		System.out.println(" Grade is C with number " + number);
		break;
		}
		
		
	    case 7 :
		if ( number >=60 && number <65 )
		{
			
		System.out.println(" Grade is D+ with number " + number);
		break;
		}
		
		
	    case 8 :
		if ( number >=50 && number <60 )
		{
			
		System.out.println(" Grade is D with number " + number);
		break;
		}
		
		
		
	    case 9 :
		if ( number >=0 && number <50 )
		{
			
		System.out.println(" Grade is F with number " + number);
		break;
		}
		
		
		
	
			
		
		
	    }
  }
}
