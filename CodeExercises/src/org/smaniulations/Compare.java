/*
 * Application that uses String method compareTo to compare two strings input from the user ,
 *   outputting if it is less than, greater than or equal
 */

package org.smaniulations;

import java.util.Scanner;

public class Compare {

	public static void main(String[] args) {
		System.out.println("to check if the given strings are same");
		
		//creating scanner object to input string from the user
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the first string");
		
		//reading the input to a variable 
		String s1= scan.next();
		
		System.out.println("Enter the second string");
		
		//reading the second string
		String s2 = scan.next();
		
		//closing the scanner class
		scan.close();

		//using compareTo method to compare the two strings
		
		int s= s1.compareTo( s2 );
		if(s==0){
			System.out.println("both strings are equal");
			
		}
		else if(s<0){
			System.out.println("String one is less than second one");
			
		}
		else
			System.out.println("String two is less that first one");

	}

}
