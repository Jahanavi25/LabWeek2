/* To Demonstrate how various exceptions are caught with catch(Exception e)
 *  
 *    define a class ExceptionA and ExceptionB 
 *    
 *    create try blocks that throw exceptions of types Nullpointer, IO, ExceptionA, ExceptionB
 *    
 *    all the exceptions should be caught in catch 
 */

package org.handling;

import java.io.IOException;

public class ExceptionTest {

	public static void main(String[] args) {
	
		//throwing exceptions ins try and catching them in catch block
		
    try{
    	throw new NullPointerException("NullPointerException");
    }    
    catch(Exception e){
    	System.out.println("Exception caugth is "+e.getMessage());
    }
    try{
    	throw new ExceptionA("ExceptionA");
    }
    catch(Exception e){
    	System.out.println("Exception caugth is "+e.getMessage());
    }
    
    try{
    	throw new ExceptionB("ExceptionB");
    }
    catch(Exception e){
    	System.out.println("Exception caugth is "+e.getMessage());
	}
    
    try{
    	throw new IOException("IOException");
    }
    catch(Exception e){
    	System.out.println("Exception caugth is "+e.getMessage());
    }
	}

}

//Declaring class ExceptionA 
class ExceptionA extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ExceptionA(String e){
		super(e);
	}
}

class ExceptionB extends ExceptionA{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ExceptionB(String e){
		super(e);
	}
	
}
