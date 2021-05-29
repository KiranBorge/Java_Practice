class AbnormalTermination
{
	public static void main(String[] args)
	{
		doStuff();
		System.out.println(10/0);
	}
	
	public static void doStuff()
	{
		doMoreStuff();
		System.out.println("Hi");
	}
	public static void doMoreStuff()
	{
		System.out.println("Hello");
	}
}
/*
Output:
       Hello
	   Hi
       Exception in thread "main" java.lang.ArithmeticException: / by zero
        at AbnormalTermination.main(AbnormalTermination.java:6)
		*/