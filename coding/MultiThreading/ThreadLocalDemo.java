class ThreadLocalDemo extends Exception
{
	public static void main(String[] args) 
	{
		
			ThreadLocal tl = new ThreadLocal();
			/*{
				public Object initialValue()
				{
					return "abc";
				}
			}; */
			
			System.out.println(tl.get());//null
			tl.set("Kiran");
			System.out.println(tl.get());//Kiran
			tl.remove();
			System.out.println(tl.get());//null
		
	}
}

/* OUTPUT:
null
Kiran
null
*/