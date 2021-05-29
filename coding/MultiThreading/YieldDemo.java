class MyThread extends Thread
{
	
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Child Thread");
			Thread.yield();
		}
	}
}

public class YieldDemo
{
	public static void main(String[] args)
	{
		MyThread t= new MyThread(); // Thread Instatiation
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread");
		}
		
	}
}
/*
OUTPUT1: 
Main Thread
Main Thread
Main Thread
Main Thread
Main Thread
Main Thread
Main Thread
Main Thread

Main Thread
Main Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread

OUTPUT2: 
Main Thread
Main Thread
Child Thread
Main Thread
Child Thread
Main Thread
Child Thread
Main Thread
Child Thread
Main Thread
Child Thread
Main Thread
Child Thread
Main Thread
Child Thread
Main Thread
Child Thread
Main Thread
Child Thread
Child Thread
*/