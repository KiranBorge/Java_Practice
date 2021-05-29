class MyThread extends Thread
{
	public void run()
	{
		
			System.out.println("No arg Thread");
	}
	public void run(int i)
	{
		System.out.println("int arg method");
	}
}

class RunOverloading
{
	public static void main(String[] args)
	{
		MyThread t= new MyThread(); // Thread Instatiation
		t.start(); 
		
	}
}
/*
Run method overloaded: - 

					Run method overloading is possible but thread class start method invoked only in No arg run method.
					We have to call other overloaded method explicitly like a normal method.
*/