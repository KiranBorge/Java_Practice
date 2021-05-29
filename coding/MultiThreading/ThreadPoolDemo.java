import java.util.concurrent.*;
class MyRunnable implements Runnable
{
	String name;
	MyRunnable(String name)
	{
		this.name = name;
	}
	public void run()
	{
		System.out.println(name + " started job by thread : " + Thread.currentThread().getName());
		
		try{Thread.sleep(2000);}
		catch(InterruptedException e){}
		
		System.out.println(name + " Completed job by thread : " + Thread.currentThread().getName());
	}
}
class ThreadPoolDemo
{
	public static void main(String[] args)
	{
		MyRunnable[] jobs = { new MyRunnable("Kiran"),
							 new MyRunnable("Vishal"),
							 new MyRunnable("Subhash"),
							 new MyRunnable("Amol"),
							 new MyRunnable("Mohan"),
							 new MyRunnable("Sharad")};
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		for(MyRunnable job:jobs)
		{
			service.submit(job);
		}
		
		service.shutdown();
	}
}