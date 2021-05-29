class PrintExceptionDemo
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println(10/0);
		}catch(ArithmeticException e){
			System.out.println("This is exmaple og printStackTrace method: ");
			e.printStackTrace();
			System.out.println("\n");
			System.out.println("This is exmaple of toString method: ");
			System.out.println(e.toString());
			
			System.out.println("\n");
			System.out.println("This is exmaple of getMessage method: ");
			System.out.println(e.getMessage());
		}
	}
}

/*
OUTPUT : 
This is exmaple og printStackTrace() method:
java.lang.ArithmeticException: / by zero
        at PrintExceptionDemo.main(PrintExceptionDemo.java:7)


This is exmaple of toString() method:
java.lang.ArithmeticException: / by zero


This is exmaple of getMessage() method:
/ by zero
