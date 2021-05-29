class MyThread extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("child Thread");
			try
			{
				Thread.sleep(10000);
			}catch(InterruptedException e)
			{
				
			}
		}
	}
}

class DaemonThreadDemo
{
	public static void main(String[] args)
	{
		/*System.out.println("Main Thread Daemon or not : " +Thread.currentThread().isDaemon());
		MyThread t = new MyThread();
		System.out.println("Child Thread is Daemon or not : "+t.isDaemon());
		t.setDaemon(true); // Changing nature of child thread
		System.out.println("After setting Child Thread to Daemon : " +t.isDaemon());
		
		Thread.currentThread().setDaemon(true); */
		MyThread t = new MyThread();
		t.setDaemon(true); 
		t.start();
		System.out.println("Main Thread");
		
	}
}

/* Output
Main Thread Daemon or not : false
Child Thread is Daemon or not : false
After setting Child Thread to Daemon : true
Exception in thread "main" java.lang.IllegalThreadStateException
        at java.lang.Thread.setDaemon(Unknown Source)
        at DaemonThreadDemo.main(DaemonThreadDemo.java:19)
		
		*/