class Display
{
	public static synchronized void wish(Display d, String name)
	{
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
		d.wish(d,name);
				
	}	
}
class SyncDemo
{
	public static void main(String[] args)
	{
		Display d1 = new Display();
		Display d2 = new Display();
		MyThread t1= new MyThread(d1,"Sachin");
		MyThread t2= new MyThread(d2,"Yuvraj");
		
		t1.start();
		t2.start();
	}
}

/*
OUTPUT When public synchronized void wish() :
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

OUTPUT When public void wish() :

Good Morning : Good Morning : Sachin
Yuvraj
Good Morning : Good Morning : Sachin
Good Morning : Yuvraj
Good Morning : Sachin
Yuvraj
Good Morning : Good Morning : Yuvraj
Good Morning : Sachin
Good Morning : Sachin
Good Morning : Yuvraj
Good Morning : Sachin
Good Morning : Yuvraj
Good Morning : Yuvraj
Good Morning : Sachin
Good Morning : Yuvraj
Sachin
Good Morning : Good Morning : Yuvraj
Good Morning : Sachin
Good Morning : Yuvraj
Sachin
*/
