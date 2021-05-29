class MyThread extends Thread
{
	
	public void run()
	{
		System.out.println(Thread.currentThread().getPriority());
		/*for(int i=0;i<10;i++)
		{
			System.out.println("Child Thread");
		}*/
	}
}

public class PriorityDemo
{
	public static void main(String[] args)
	{
		MyThread t= new MyThread(); // Thread Instatiation
		t.setPriority(10);
		t.start();
		System.out.println(Thread.currentThread().getPriority());
		/*for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread");
		}*/
		
	}
}