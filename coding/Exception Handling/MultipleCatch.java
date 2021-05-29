class MultipleCatch
{
	public static void main(String[] args)
	{
		doStuff();
	}
	public static void doStuff(){
		try{
			
			//System.out.println(10/0);  // invalid code where we generate exception "/ by zero"
			String s = null;
			System.out.println(s.length());// invalid code where we generate exception "NullPointerException"
			
		}catch(ArithmeticException e){
			
			e.printStackTrace();
			
		}catch(Exception ae){
			
			ae.printStackTrace();
		}
	}
	
}

/*
Loopwholes
1) if our program has try with multiple catch block then order of catch block is very important, we have to take child first then parent otherwise
we will get below error:
MultipleCatch.java:15: error: exception ArithmeticException has already been caught
                }catch(ArithmeticException e){
                 ^
1 error

2) We can't declare 2 catch block  for same exception otherwise we will get comiple timer error
MultipleCatch.java:16: error: exception ArithmeticException has already been caught
                }catch(ArithmeticException ae){
                 ^
1 error

OUTPUT: 
System.out.println(10/0); :

java.lang.ArithmeticException: / by zero
        at MultipleCatch.doStuff(MultipleCatch.java:10)
        at MultipleCatch.main(MultipleCatch.java:5)
		
String s = null;
System.out.println(s.length());	
java.lang.NullPointerException
        at MultipleCatch.doStuff(MultipleCatch.java:12)
        at MultipleCatch.main(MultipleCatch.java:5)		
*/
