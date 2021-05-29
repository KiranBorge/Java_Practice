class Display
{
	public void wish(String name)
	{
		synchronized(Display.class)
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
class SyncBlockDemo
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
if we declare display method as a static and trying add synchronized block then we will get below error:
SyncBlockDemo.java:5: error: non-static variable this cannot be referenced from a static context
                synchronized(this)




OUTPUT:
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


OUTPUT after  below code:
		Display d1 = new Display();
		Display d2 = new Display();
		MyThread t1= new MyThread(d1,"Sachin");
		MyThread t2= new MyThread(d2,"Yuvraj");
		
		Good Morning : Good Morning : Sachin
Good Morning : Yuvraj
Good Morning : Sachin
Good Morning : Yuvraj
Good Morning : Yuvraj
Good Morning : Sachin
Good Morning : Yuvraj
Good Morning : Sachin
Good Morning : Yuvraj
Good Morning : Sachin
Good Morning : Yuvraj
Good Morning : Sachin
Good Morning : Yuvraj
Good Morning : Sachin
Good Morning : Yuvraj
Good Morning : Sachin
Good Morning : Yuvraj
Good Morning : Sachin
Good Morning : Sachin
Yuvraj


If we apply class level lock then we will get below output:
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
*/


