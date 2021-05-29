class MyThread extends Thread
{
	
	public void run()
	{
		System.out.println("run method");
	}
}

public class RestartThread
{
	public static void main(String[] args)
	{
		MyThread t= new MyThread(); // Thread Instatiation
		t.start(); 
		
		System.out.println("main method");
		t.start();
	}
}

/* output is :
					main method
					run method
					Exception in thread "main" java.lang.IllegalThreadStateException
					at java.lang.Thread.start(Unknown Source)
					at RestartThread.main(RestartThread.java:18)
					
					
	Note: If we are trying to restart the thread then we will get Runtime Exception saying "IllegalThreadStateException".
				*/