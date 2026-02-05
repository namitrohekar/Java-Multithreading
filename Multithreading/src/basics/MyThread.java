package basics;

public class MyThread  extends Thread{
	
	
	
	
	@Override
	public void run(){
		
		System.out.println("RUNNING");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		
		MyThread t1 = new MyThread();
		
		System.out.println(t1.getState()); // Object has been created hence it is in NEW State 
		
		t1.start();
		System.out.println(t1.getState()); // Thread has been started , so RUNNABLE state 
		
		Thread.sleep(1000);
		System.out.println(t1.getState());
		t1.join();
		System.out.println(t1.getState());
	}
}
