class InnerThreadDemo
{
	public static void main(String[] args) throws InterruptedException
	{
		ThreadA a= new ThreadA();
		a.start();
		synchronized(a)
		{
			System.out.println("Main Thread calling wait() method");
			a.wait();
			System.out.println("Main Thread received notification from child thread");
			System.out.println(a.total);
		}
		
	}
	
}

class ThreadA extends Thread
{
	int total=0;
	public void run()
	{
		synchronized(this)
		{
			System.out.println("Child Thread start calulating");
			for(int i=1; i<=100;i++)
			{
				total = total + i;
			}
			System.out.println("After calculation Child Thread giving notification to Main");
			this.notify();
		}
	}
}


/* Output : 
Main Thread calling wait() method
Child Thread start calulating
After calculation Child Thread giving notification to Main
Main Thread received notification from child thread
5050
*/