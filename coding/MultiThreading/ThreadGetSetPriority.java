class MyThread extends Thread
{
	
	public void run()
	{
		System.out.println("run method Priority is " +Thread.currentThread().getPriority());
	}
}

public class ThreadGetSetPriority
{
	public static void main(String[] args)
	{
		System.out.println("main method Priority is " +Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(7);
		MyThread t= new MyThread(); // Thread Instatiation
		t.start();
		
		
	}
}
/* 
  Output : 
  main method Priority is 5  -- default main thread priority
  run method Priority is 7   -- after changing main thread priority  - mian thread is parent thread of MyThread class
  
  