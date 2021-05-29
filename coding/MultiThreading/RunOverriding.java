class MyThread extends Thread
{
	
}

public class RunOverriding
{
	public static void main(String[] args)
	{
		MyThread t= new MyThread(); // Thread Instatiation
		t.start(); 
		
	}
}
/*
Note : It is highly recommonded to override run method otherwise don't go for multithreading concept
*/