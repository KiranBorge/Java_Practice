class A
{
	public synchronized void d1(B b)
	{
		System.out.println("Main start executing d1() method");
		try
		{
			Thread.sleep(5000);
		}catch(InterruptedException e){}
		
			System.out.println("Main Thread trying to call B's method");			
			b.last();
		
	}
	public synchronized void last()
	{
		System.out.println("Inside B, last() method");
	}
}
class B
{
	public synchronized void d2(A a)
	{
		System.out.println("Child start executing d2() method");
		try
		{
			Thread.sleep(5000);
		}catch(InterruptedException e){}
		
			System.out.println("Main Thread trying to call A's method");
			a.last();
		
	}
	public synchronized void last()
	{
		System.out.println("Inside A, last() method");
	}
}
class DeadLock extends Thread
{
	A a = new A();
	B b = new B();
	
	public void m1()
	{
		this.start();
		a.d1(b);
	}
	public void run()
	{
		b.d2(a);
	}
	
	public static void main(String[] args)
	{
		DeadLock d = new DeadLock();
		d.m1();
	}
}
/*
OUTPUT both last methods without declaring synchronized
Main start executing d1() method
Child start executing d2() method
Main Thread trying to call B's method
Main Thread trying to call A's method
Inside A, last() method
Inside B, last() method

*/
