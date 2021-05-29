class MyThread extends Thread
{
	
	public void run()
	{
		System.out.println("run method");
	}
}

public class ThreadGetSetName
{
	public static void main(String[] args)
	{
		System.out.println(Thread.currentThread().getName());
		MyThread t= new MyThread(); // Thread Instatiation
		System.out.println(t.getName());
		Thread.currentThread().setName("Kiran Borge");
		System.out.println(Thread.currentThread().getName());
		
		
		System.out.println("main method");
		
	}
}