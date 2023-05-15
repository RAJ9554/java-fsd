package stack;
import java.util.Stack;
public class Stackpro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Stack<Integer> stack = new Stack<>();

	        // Insert elements into the stack
	        stack.push(1);
	        stack.push(2);
	        stack.push(3);

	        // Print the stack
	        System.out.println("Stack: " + stack);

	        // Remove the top element from the stack
	        int poppedElement = stack.pop();
	        System.out.println("Popped element: " + poppedElement);

	        // Print the stack again
	        System.out.println("Stack after popping: " + stack);

	        // Peek at the top element of the stack
	        int topElement = stack.peek();
	        System.out.println("Top element: " + topElement);

	        // Insert a new element into the stack
	        stack.push(4);

	        // Print the stack again
	        System.out.println("Stack after pushing: " + stack);
	    }
	}

	


