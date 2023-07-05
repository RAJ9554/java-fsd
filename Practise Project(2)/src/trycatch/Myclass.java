package trycatch;

public class Myclass {

	public static void main(String[] args) {
		 System.out.println("11"); 
		   System.out.println("Before divide"); 

		// Applying try-catch block to handle exception.
		   try 
		   { 
		     int x = 1/0; 
		     System.out.println("After divide"); 
		   } 
		   catch(ArithmeticException ae) // Here, ae is a reference variable of exception object. 
		   { 
		     System.out.println("A number cannot be divided by zero"); 
		   } 
		   System.out.println("22"); 
		 } 
		}