import java.util.concurrent.locks.*;
class MyThread extends Thread
{
	static ReentrantLock l =  new ReentrantLock();
	
	MyThread(String name)
	{
		super(name);
	}
	public void run()
	{
		if(l.tryLock())
		{
			System.out.println(Thread.currentThread().getName() +"....got lock and perform safe operation");
			try{Thread.sleep(2000);}
			catch(InterruptedException e){}
			l.unlock();
			
		}else
		{
			System.out.println(Thread.currentThread().getName() +"....did not get lock and perform alternative operation");
		}
	}
}
class TryLockDemo
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
 1 ) Second Thread....got lock and perform safe operation
First Thread....did not get lock and perform alternative operation

2) First Thread....got lock and perform safe operation
Second Thread....did not get lock and perform alternative operation