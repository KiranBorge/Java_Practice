class EqualDemo
{
	int rollno;
	String name;
	
	EqualDemo(String name, int rollno)
	{
		this.name = name;
		this.rollno = rollno;
	}
	public boolean equals(Object o)
	{
		
		if(o instanceof EqualDemo)
		{
			EqualDemo e = (EqualDemo)o;
			
			if(name.equals(e.name) && rollno == e.rollno)
			{
				return true;
				
			}else{
				return false;
			}
			
		}else{
			return false;
		}
		
		
		/*
		try{
		String name1 = this.name;
		int rollno1 = this.rollno;
		EqualDemo e = (EqualDemo)o;
		String name2 = e.name;
		int rollno2 = e.rollno;
		if(name1.equals(name2) && rollno1 == rollno2)
		{
			return true;
		}else{
			return false;
		}
		}
		catch(ClassCastException e)
		{
			return false;
		}
		catch(NullPointerException ee)
		{
			return false;
		} */
	}
	public static void main(String[] args)
	{
		
		
			EqualDemo s1 = new EqualDemo("Kiran", 101);
			EqualDemo s2 = new EqualDemo("Sharad", 102);
			EqualDemo s3 = new EqualDemo("Kiran", 101);
			EqualDemo s4 = s1;
			
			System.out.println(s1.equals(s2));
			System.out.println(s1.equals(s3));
			System.out.println(s1.equals(s4));
			System.out.println(s1.equals("Kiran"));
			System.out.println(s1.equals(null ));
		
	}
}

/*
false
false
true
*/