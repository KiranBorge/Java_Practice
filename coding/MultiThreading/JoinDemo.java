class MyThread extends Thread
{
	
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Seeta Thread");
			try
			{
				Thread.sleep(2000);
			}catch(InterruptedException e)
			{
				
			}
		}
	}
}

public class JoinDemo
{
	public static void main(String[] args) throws InterruptedException
	{
		MyThread t= new MyThread(); // Thread Instatiation
		t.start();
		
		//t.join();
		t.join(5000);
		for(int i=0;i<10;i++)
		{
			System.out.println("Ram Thread");
		}
		
	}
}

/* output : When t.join();
Seeta Thread
Seeta Thread
Seeta Thread
Seeta Thread
Seeta Thread
Seeta Thread
Seeta Thread
Seeta Thread
Seeta Thread
Seeta Thread
Ram Thread
Ram Thread
Ram Thread
Ram Thread
Ram Thread
Ram Thread
Ram Thread
Ram Thread
Ram Thread
Ram Thread




When t.join(5000);
Seeta Thread
Seeta Thread
Seeta Thread
Ram Thread
Ram Thread
Ram Thread
Ram Thread
Ram Thread
Ram Thread
Ram Thread
Ram Thread
Ram Thread
Ram Thread
Seeta Thread
Seeta Thread
Seeta Thread
Seeta Thread
Seeta Thread
Seeta Thread
Seeta Thread
*/

