class DefaultExceptionCode
{
	public static void main(String[] args)
	{
		doStuff();
	}
	public static void doStuff()
	{
		doMoreStuff();
	}
	public static void doMoreStuff()
	{
		System.out.println(10/0);
		
	}
}

/* Output : 
   Exception in thread "main" java.lang.ArithmeticException: / by zero
        at DefaultExceptionCode.doMoreStuff(DefaultExceptionCode.java:14)
        at DefaultExceptionCode.doStuff(DefaultExceptionCode.java:9)
        at DefaultExceptionCode.main(DefaultExceptionCode.java:5)
*/