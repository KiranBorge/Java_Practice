class MyThread extends Thread
{
	public void start()
	{
		super.start();
		System.out.println("start method");
	}
	public void run()
	{
		System.out.println("run method");
	}
}

public class SuperStartOverriding
{
	public static void main(String[] args)
	{
		MyThread t= new MyThread(); // Thread Instatiation
		t.start(); 
		
		System.out.println("main method");
	}
}
/*
output1 : 
start method
main method
run method

output2:
 start method
run method
main method  */