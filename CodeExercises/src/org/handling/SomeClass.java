/* To Show constructor passing information about constructor failure to an exception handler
 * 
 *   To define a class which throws exception in the constructor 
 *   to try to create an object of the class and catch the exception that's thrown from the constructor
 * 
 */

package org.handling;

public class SomeClass {
	
	public SomeClass() throws Exception{
		throw new Exception();
	}

	public static void main(String[] args) {
        
		try {
			//@SuppressWarnings("unused");
			
			//creating object of class in try block
			SomeClass someclass = new SomeClass();
		} 
		
		//catching the exceptions
		catch (Exception exception) {
		   System.out.println("Exception e:" +exception);
		   exception.printStackTrace();
		}
		

	}

}
