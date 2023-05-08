package practiceExercise;
import java.util.Scanner;
public class problem1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Implicit Type Casting");
		//implicit type casting
		 byte p = sc.nextByte();
	      System.out.println("byte value : "+p);  
	      short q =(short)p;  
	      System.out.println("short value : "+q);  
	      int r =(int)q;  
	      System.out.println("int value : "+r);  
	      long s = (long)r;  
	      System.out.println("long value : "+s);  
	      float t =(float)s;  
	      System.out.println("float value : "+t);  
	      double u = (double)t;  
	      System.out.println("double value : "+u); 
	      
	      System.out.println("\n");
	      
	      System.out.println("Explicit Type Casting");
	      
	      double x=45.5;
			int y=(int)x;
			System.out.println("Value of x: "+x);
			System.out.println("Value of y: "+y);
	      

	}

}
      
