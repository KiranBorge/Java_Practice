class MyRunnable implements Runnable   //Defining Thread
{
	
	public void run()
	{
		for(int i=0;i<10; i++)   // job of Thread  and Executed by child thread
		{
			System.out.println("Child Thread");
		}
	}
}
class DefThreadByRunnable
{
	public static void main(String[] args)
	{
		
		MyRunnable r= new MyRunnable();
		Thread t = new Thread(r);
		
		t.start();
		
		for(int i=0;i<10; i++)          //Executed by main thread
		{
			System.out.println("main Thread");
		}
	}

}

/*  Output1 :
main Thread
main Thread
main Thread
main Thread
main Thread
main Thread
main Thread
main Thread
main Thread
main Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread

output2:
main Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
main Thread
main Thread
main Thread
main Thread
main Thread
main Thread
main Thread
main Thread
main Thread

*/ 