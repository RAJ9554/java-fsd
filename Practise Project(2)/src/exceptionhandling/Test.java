package exceptionhandling;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter two integer numbers");

		// Read two integer numbers.
		  int num1 = sc.nextInt();
		  int num2 = sc.nextInt();
		  System.out.println(num1 + "/" + num2 + " = " + (num1/num2));
	}

}
