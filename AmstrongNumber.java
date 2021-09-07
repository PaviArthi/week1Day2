package assignments;

public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  calculate, reminder=0,quotient=0,original=153;
		calculate=original;
		while (calculate > 0) 
		{    
			reminder=calculate % 10;  
			calculate = calculate / 10;
			quotient=quotient+(reminder * reminder * reminder);
			 
		}  
		  if (original == quotient) 
		  {  
		   System.out.println("Armstrong number"); 
		  }
		  else 
		  {     
			 System.out.println("Not armstrong Number");   
		  } 
		 
	 
	}

}
