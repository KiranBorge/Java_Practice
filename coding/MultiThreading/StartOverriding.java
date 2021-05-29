class MyThread extends Thread
{
	public void start()
	{
		System.out.println("start method");
	}
	public void run()
	{
		System.out.println("run method");
	}
}

public class StartOverriding
{
	public static void main(String[] args)
	{
		MyThread t= new MyThread(); // Thread Instatiation
		t.start(); 
		
		System.out.println("main method");
	}
}

/* if we override the start method than our start method will be executed just like a normal method call and new thread won't be created.

   */