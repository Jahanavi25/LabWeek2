package PackCodeExercises;

import java.util.Scanner;

public class FiveNine {

	public static void main(String[] args) { 
		int i;
		//part a
		for(i=1;i<=100;i++){
			System.out.println(i);
		} 
		//part b
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number");
		int num = input.nextInt();
		switch(num%2){
		case 0: 
			System.out.println("given number is even");
			break;
		
		case 1:
			System.out.println("given number is odd");
			break;
		}
		


		//part c
		int j;
		for (j =19; j>=1; j--){
			if(j%2!=0){
				System.out.print(j+"\n");
			}
		}
		//part d
		int counter =2;
		do{
			System.out.println(counter);
			counter+=2;
		}while(counter<=100);

	}

}  
