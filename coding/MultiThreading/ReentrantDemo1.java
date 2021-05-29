import java.util.concurrent.locks.*;
class Display
{
	ReentrantLock l = new ReentrantLock();
	
	public void wish(String name)
	{
		l.lock();
		for(int i=0;i<10;i++)
		{
			
			System.out.print("Good Morning : ");
			try
			{
				Thread.sleep(2000);
				System.out.println(name);
			}catch(InterruptedException e)
			{
				
			}
		}
		l.unlock();
	}
}

class MyThread extends Thread
{
	Display d;
	String name;
	MyThread(Display d,String name)
	{
		this.d = d;
		this.name = name;
	}
	
	public void run()
	{
		d.wish(name);
				
	}	
}
class ReentrantDemo1
{
	public static void main(String[] args)
	{
		Display d1 = new Display();
		MyThread t1= new MyThread(d1,"Sachin");
		MyThread t2= new MyThread(d1,"Yuvraj");
		
		t1.start();
		t2.start();
	}
}

/* OUTPUT
Good Morning : Yuvraj
Good Morning : Yuvraj
Good Morning : Yuvraj
Good Morning : Yuvraj
Good Morning : Yuvraj
Good Morning : Yuvraj
Good Morning : Yuvraj
Good Morning : Yuvraj
Good Morning : Yuvraj
Good Morning : Yuvraj
Good Morning : Sachin
Good Morning : Sachin
Good Morning : Sachin
Good Morning : Sachin
Good Morning : Sachin
Good Morning : Sachin
Good Morning : Sachin
Good Morning : Sachin
Good Morning : Sachin
Good Morning : Sachin

*/