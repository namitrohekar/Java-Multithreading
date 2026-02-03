package basics;

public class ThreadBasics {
	public static void main(String[] args) {
		
		World world = new World();
		world.setName("Thread");
		world.start(); 
		
		
		WorldRunnable runnable = new WorldRunnable();
		
		Thread t1 = new Thread(runnable);
		t1.setName("Runnable");
		t1.start();
		
		
		
		for ( int i = 1 ; i < 10000; i ++) {
			System.out.println(Thread.currentThread().getName());
		}
	}

}
   