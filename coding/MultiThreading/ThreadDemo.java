class MyThread extends Thread
{
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			System.out.println("Child Thread");
		}
	}
}

class ThreadDemo
{
	public static void main(String[] args)
	{
		MyThread t= new MyThread(); // Thread Instatiation
		t.start(); // Starting of child thread
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread");
		}
	}
}