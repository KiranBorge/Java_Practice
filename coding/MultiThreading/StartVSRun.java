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

class StartVSRun
{
	public static void main(String[] args)
	{
		MyThread t= new MyThread(); // Thread Instatiation
		t.run(); // main thread calling run method as normal method calling
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread");
		}
	}
}