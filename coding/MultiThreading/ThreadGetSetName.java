class MyThread extends Thread
{
	
	public void run()
	{
		System.out.println("run method is executed by " + Thread.currentThread().getName());
	}
}

public class ThreadGetSetName
{
	public static void main(String[] args)
	{
		MyThread t= new MyThread(); // Thread Instatiation
		 t.start();
		Thread.currentThread().setName("Kiran");
		System.out.println("main method is executed by " +Thread.currentThread().getName());
	}
}
/*

This line is executed by main
This line is executed by Thread-0
*/