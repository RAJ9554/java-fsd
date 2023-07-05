package doublylinked;


	class Node {
	    int data;
	    Node prev;
	    Node next;
	 
	    public Node(int data) {
	        this.data = data;
	        this.prev = null;
	        this.next = null;
	    }
	}
	 
	class DoublyLinkedList {
	    Node head;
	 
	    public void insert(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	        } else {
	            Node current = head;
	            while (current.next != null) {
	                current = current.next;
	            }
	            current.next = newNode;
	            newNode.prev = current;
	        }
	    }
	 
	    public void traverseForward() {
	        if (head == null) {
	            System.out.println("Doubly linked list is empty");
	            return;
	        }
	        Node current = head;
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }
	 
	    public void traverseBackward() {
	        if (head == null) {
	            System.out.println("Doubly linked list is empty");
	            return;
	        }
	        Node current = head;
	        while (current.next != null) {
	            current = current.next;
	        }
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.prev;
	        }
	        System.out.println();
	    }
	
	 
	
	    public static void main(String[] args) {
	        DoublyLinkedList dll = new DoublyLinkedList();
	        dll.insert(1);
	        dll.insert(7);
	        dll.insert(8);
	        dll.insert(6);
	        dll.insert(4);
	        System.out.println("Doubly linked list in forward direction:");
	        dll.traverseForward();
	        System.out.println("Doubly linked list in backward direction:");
	        dll.traverseBackward();
	    }
	}
