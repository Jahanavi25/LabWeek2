package PackCodeExercises;

import java.util.Scanner;

public class FourThreeZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int count = 0, rev =0, rem;
		System.out.print("Give a number");
		int num = input.nextInt();
		int num1 = num;
		
		while(num > 0) {
	        rem = num % 10;
	        rev = rem + rev * 10;
	        num = num / 10;
	        count++;
	    }
	    
	    if(count == 5) {
	        if(num1== rev) {
	            System.out.printf("The Given Number %d is Palindrome", num1);
	        } else {
	        	System.out.printf("The Given Number %d is NOT Palindrome",num1);
	        }
	    } else {
	    	System.out.printf("The given  %d  number is not a five digit number!",num1);
	    }
	    
	}

}
