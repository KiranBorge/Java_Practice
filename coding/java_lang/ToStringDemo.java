class ToStringDemo
{
	int rollno;
	String name;
	
	ToStringDemo(String name, int rollno)
	{
		this.name = name;
		this.rollno = rollno;
	}
	
	public String toString()
	{
		return name + "...."+ rollno;
	}
	
	public static void main(String[] args)
	{
		ToStringDemo s1 = new ToStringDemo("Kiran",101);
		ToStringDemo s2 = new ToStringDemo("Sharad",102);
		ToStringDemo s3 = new ToStringDemo("Mohan",103);
		
		System.out.println(s1);
		System.out.println("=====================================================");
		System.out.println(s1.toString());
		System.out.println("=====================================================");
		System.out.println(s2);
		System.out.println("=====================================================");
		System.out.println(s3);
		
		
		
		
	}
}

/*
OUTPUT
ToStringDemo@1db9742
=====================================================
ToStringDemo@1db9742
=====================================================
ToStringDemo@106d69c
=====================================================
ToStringDemo@52e922

*/