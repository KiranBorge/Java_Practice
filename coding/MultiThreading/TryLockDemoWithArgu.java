import java.util.concurrent.locks.*;
import java.util.concurrent.*;
class MyThread extends Thread
{
	static ReentrantLock l =  new ReentrantLock();
	
	MyThread(String name)
	{
		super(name);
	}
	public void run()
	{
		
		do
		{
			try
			{
				if(l.tryLock(5000,TimeUnit.MILLISECONDS))
				{
					System.out.println(Thread.currentThread().getName() +".. get lock and perform safe operations");
					Thread.sleep(30000);
					
					System.out.println(Thread.currentThread().getName() +".. Releases the lock");
					l.unlock();
					break;
				}
				else
				{
					System.out.println(Thread.currentThread().getName() +".. unable to get the lock but try again");
				}
			}catch(InterruptedException e){}
		}while(true);
	}
}
class TryLockDemoWithArgu
{
	public static void main(String[] args)
	{
		MyThread t1 = new MyThread("First Thread");
		MyThread t2 = new MyThread("Second Thread");
		t1.start();
		t2.start();
	}
}
/* OUTPUT
First Thread.. get lock and perform safe operations
Second Thread.. unable to get the lock but try again
Second Thread.. unable to get the lock but try again
Second Thread.. unable to get the lock but try again
Second Thread.. unable to get the lock but try again
Second Thread.. unable to get the lock but try again
First Thread.. Releases the lock
Second Thread.. get lock and perform safe operations
Second Thread.. Releases the lock

*/