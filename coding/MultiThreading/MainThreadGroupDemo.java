class MyThread extends Thread
{
	MyThread(ThreadGroup g, String name)
	{
		super(g, name);
	}
	public void run()
	{
		System.out.println("Child Thread");
		try
		{
			Thread.sleep(5000);
		}catch(InterruptedException e){}
	}
}

class MainThreadGroupDemo
{
	public static void main(String[] args) throws InterruptedException
	{
		ThreadGroup pg = new ThreadGroup("Parent ThreadGroup");
		ThreadGroup cg = new ThreadGroup(pg,"Child ThreadGroup");
		
		MyThread t1 = new MyThread(pg,"Child Thread1");
		MyThread t2 = new MyThread(pg,"Child Thread2");
		t1.start();
		t2.start();
		
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		pg.list();
		Thread.sleep(10000);
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		pg.list();
	}
}

/* Output is:
2
1
Child Thread
java.lang.ThreadGroup[name=Parent ThreadGroup,maxpri=10]
Child Thread
    Thread[Child Thread1,5,Parent ThreadGroup]
    Thread[Child Thread2,5,Parent ThreadGroup]
    java.lang.ThreadGroup[name=Child ThreadGroup,maxpri=10]
0
1
java.lang.ThreadGroup[name=Parent ThreadGroup,maxpri=10]
    java.lang.ThreadGroup[name=Child ThreadGroup,maxpri=10]
	*/