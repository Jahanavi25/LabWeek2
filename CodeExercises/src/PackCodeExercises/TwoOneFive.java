package PackCodeExercises;

import java.util.Scanner;

/**
Write an application that asks the user to enter two integers, obtain them from the user and prints their
sum, product, difference and quotient
 * 
 */

public class TwoOneFive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num1;
		int num2;
		int num3;
		
		System.out.print("Give first integer");
		num1 = input.nextInt();
		
		System.out.print("Give second integer");
		num2 = input.nextInt();
		
		int sum = num1+ num2;
		int product = num1*num2;
		int difference = num1-num2;
		int quotient = num1/num2;
		
		System.out.println("the sum of numbers is\t" +sum+ "\nthe product of two numbers is\t"+product+"\nthe difference of numbers is\t"+difference+"\nThe quotient of number is\t"+quotient);
		

	}

}
