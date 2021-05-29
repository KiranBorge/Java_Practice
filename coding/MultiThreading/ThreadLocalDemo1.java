class CustomerThread extends Thread
{
	static Integer custId = 0;
	private static ThreadLocal tl = new ThreadLocal()
	{
		protected Integer initialValue()
		{
			return ++custId;
		}
	};
	CustomerThread(String name)
	{
		super(name);
	}
	public void run()
	{
		System.out.println(Thread.currentThread().getName() + " Executing with custmer id " + tl.get());
	}
}
class ThreadLocalDemo1
{
	public static void main(String[] args)
	{
		CustomerThread t1 = new CustomerThread("Customer - 1");
		CustomerThread t2 = new CustomerThread("Customer - 2");
		CustomerThread t3 = new CustomerThread("Customer - 3");
		CustomerThread t4 = new CustomerThread("Customer - 4");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}