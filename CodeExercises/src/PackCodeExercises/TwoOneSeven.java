package PackCodeExercises;

import java.util.Scanner;

public class TwoOneSeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter first integer number");
		int num1 = input.nextInt();
		System.out.println("enter second integer number");
		int num2 = input.nextInt();
		System.out.println("enter third integer number");
		int num3= input.nextInt();
		
		int sum = num1+num2+num3;
		System.out.print("sum of numbers is "+sum);
		int average = (num1+num2+num3)/3;
		System.out.println("avergae of numbers is" +average);
		if(num1<num2){
			if(num1<num3){
				System.out.println("Smallest number is"+num1);
			}
			else{
				System.out.println("Smallest number is"+num2);
			}
		}
		else{
			if(num2<num3){
				System.out.println("Smallest number is"+num2);
				
			}
			else
			{
				System.out.println("Smallest number is"+num3);
			}
		}
	
			
			if(num1>num2){
				if(num1>num3){
					System.out.println("Largest number is"+num1);
				}
				else{
					System.out.println("Largest number is"+num3);
				}
			}
			else{
				if(num2>num3){
					System.out.println("Largest number is"+num2);
					
				}
				else
				{
					System.out.println("Largest number is"+num3);
				}
			
			
			
		}
}
}
		
		
		


