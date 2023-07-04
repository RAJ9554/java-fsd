package thread;

public class MyThread extends Thread{
	public void run() {
		System.out.println("Thread is under Running...");
		
		}
	

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
			
			t1.start();

	}

}
