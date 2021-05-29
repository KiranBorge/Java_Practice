class MyThread extends Thread
{
	static Thread mt;
	
	public void run()
	{
		try{
			mt.join();
		}catch(InterruptedException e){
			
		}
		for(int i=0;i<10;i++)
		{
			System.out.println("Child Thread");
			
		}
		
	}	
}

public class JoinChildDemo
{
	public static void main(String[] args) throws InterruptedException
	{
		MyThread.mt= Thread.currentThread();
		MyThread t = new MyThread();
		
		t.start();
		t.join();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread");
			try
			{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				
			}
		}
		
	}
}
/*
 OUTPUT : WHEN WE USE mt.join();
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

OUTPUT  : WHEN WE USE mt.join(3000);
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
Main Thread
Main Thread
Main Thread
Main Thread
Main Thread
Main Thread
Main Thread
Main Thread
Main Thread

*/