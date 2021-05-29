class MyThread extends Thread
{
	static Thread mt;
	
	public void run()
	{
		
			for(int i=1;i<=1000;i++)
			{
				System.out.println("I am Lazy Thread");
				
			}
			System.out.println("I want to sleep");
			try{
				Thread.sleep(1000);
		}catch(InterruptedException e){
			System.out.println("I am got interrupted");
		}
				
	}	
}
public class SleepDemo
{
	public static void main(String[] args) throws InterruptedException
	{
		
		MyThread t = new MyThread();
		t.start();
		t.interrupt();
		
		System.out.println("End of Main");
		
	}
}

/* OUTPUT : 
End of Main
I am Lazy Thread
I am got interrupted

*/