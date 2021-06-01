import java.util.*;
class ToStringDemo2
{
	public String toString()
	{
		return "ToStringDemo2";
	}
	public static void main(String[] args) throws Exception
	{
		String s = new String("Kiran");
		System.out.println(s);
		
		Integer i = new Integer(10);
		System.out.println(i);
		
		ArrayList l = new ArrayList();
		l.add("A"); l.add("B");
		System.out.println(l);
		
		ToStringDemo2 t = new ToStringDemo2();
		System.out.println(t);
		
	}
}