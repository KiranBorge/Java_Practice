class ParentThread extends Thread
{
	//static InheritableThreadLocal tl = new InheritableThreadLocal();
	static ThreadLocal tl = new ThreadLocal();
	public void run()
	{
		tl.set("Parent Thread");
		System.out.println("Parent Thread Value is : " + tl.get());
		ChildThread ct = new ChildThread();
		ct.start();
	}
}
class ChildThread extends Thread
{
	public void run()
	{
		System.out.println("Parent Thread Value is : " + ParentThread.tl.get());
		
	}
}

class ThreadLocalDemo3
{
	public static void main(String[] args)
	{
		ParentThread pt = new ParentThread();
		pt.start();
	}
}

/* Output : 
Parent Thread Value is : Parent Thread
Parent Thread Value is : null

*/