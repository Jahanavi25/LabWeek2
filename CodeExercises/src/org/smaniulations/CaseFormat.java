/* Displaying the Strings in lowercase and upper case format*/

package org.smaniulations;

import java.util.Scanner;

public class CaseFormat {

	public static void main(String[] args) {
		//creating object of scanner class
		Scanner input = new Scanner(System.in);
		System.out.println("Please give a String");
		
		String s1 = input.nextLine();
		System.out.println("Given string:" +s1);
		
		String s2 = s1.toUpperCase();
		System.out.println("Given string in upper case letters: " +s2);
		
		String s3 = s1.toLowerCase();
		System.out.println("Given string in lower case letters: " +s3);
		

	}

}
