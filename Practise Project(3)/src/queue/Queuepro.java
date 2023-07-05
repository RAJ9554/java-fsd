package queue;
import java.util.LinkedList;
import java.util.Queue;
public class Queuepro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new LinkedList<>();

        // Insert elements into the queue
        queue.add(3);
        queue.add(2);
        queue.add(7);
        queue.add(8);

        // Print the queue
        System.out.println("Queue: " + queue);

        // Remove the front element from the queue
        int removedElement = queue.remove();
        System.out.println("Removed element: " + removedElement);

        // Print the queue again
        System.out.println("Queue after removing: " + queue);

        // Look at the front element of the queue
        int frontElement = queue.peek();
        System.out.println("Front element: " + frontElement);

        // Insert a new element into the queue
        queue.add(4);

        // Print the queue again
        System.out.println("Queue after adding: " + queue);
   
	}

}
