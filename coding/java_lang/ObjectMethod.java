import java.lang.reflect.*;
class ObjectMethod
{
	public static void main(String[] args)throws Exception
	{
		int count =0;
		Class c = Class.forName("java.lang.Object");
		Method[] m = c.getDeclaredMethods();
		
		for(Method m1 : m)
		{
			System.out.println(m1.getName());
			count++;
		}
		System.out.println("Number of methos are : " + count);
	}
}

/* OUTPUT 
finalize
wait
wait
wait
equals
toString
hashCode
getClass
clone
notify
notifyAll
registerNatives
Number of methos are : 12

*/