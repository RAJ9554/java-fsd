package throwtocustom;
import java.util.Scanner;
public class ThrowsDemo {

	public static void calculate()
	        throws ArithmeticException, ArrayIndexOutOfBoundsException {
	        int num = 10 / 0;
	        // some code that might throw ArrayIndexOutOfBoundsException
	    }

	    public static void main(String[] args) {
	        try {
	            calculate();
	        } catch (ArithmeticException e) {
	            System.out.println("Arithmetic Exception thrown");
	            System.out.println(e.getMessage());
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("ArrayIndexOutOfBounds Exception thrown");
	            System.out.println(e.getMessage());
	        }
	    }
	}
		 
	    