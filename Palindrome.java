package assignments;

public class Palindrome {

	public static void main(String[] args) {
		int num=454, temp, i = 0, j = 0;   
		   
		temp = num;   
		while (temp > 0) 
		{   
			i = temp % 10;  
			j = (j * 10) + i;   
			temp = temp / 10; 
		 
		  }  
		if (num == j) 
		{   
			System.out.println(" The given number is palindrome"); 
			} 
		else
		{    
			System.out.println("The given number is Not palindrome Number");   
			}

	}

}
