package PackCodeExercises;

import java.util.Scanner;
import java.lang.*;


public class TwoTwoEight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius of the circle");
		float radius= input.nextFloat();
		
		System.out.printf("%f, diameter of circle is",2 * radius );
		System.out.printf("%f, circumference of circle is\n",2 * Math.PI* radius );
		System.out.printf("%f, area of circle is\n", radius * radius * Math.PI );

	}

}
