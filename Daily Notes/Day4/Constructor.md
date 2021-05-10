Constructor :

	1) Once we creates an object compalsory we should perform initialization then only object will respond.
	2) Whenever we creating an object some piece of code executed automatically. This piece of code is nothing but CONSTRUCTOR
	3) The main purpose of constructor is to initialize an object.
 e.g.
class Student
{
	String name;
	int rollno;
	
	Student(String name, int rollno)
	{
		this.name=name;
		this.rollno=rollno;
	}

	public static void main(String[] args)
	{
		Student s1= new Student("Sharad",101);
		Student s2= new Student("Mohan",102);
		Student s3= new Student("Ram",103);
		Student s4= new Student("Kiran",104);
	}
}

*Rules of writing constructor
1) class name and constructor name must be matched
2) Return type concept not applicable for constructor even void also not allowed
3) By mistake if we are trying declare return type for constructor then we willnot get any compile time erro because compiler treats as method
	hence it is legal (but stupid) to have method name same as class name. but not good programming practice

	e.g
	class Test
	{
		public void Test()
		{
			System.out.println("This is a method not constructor");
		}
		public static void main(String[] args)
		{
			Test t1 = new Test();
		}
	}
     Output: No output
4) The only applicable modifier for constructor is public,private, protected and <default>. 
   if we are trying to declare any other modifier we will get compile time error
	eg.
		class Test
		{
			static Test()
			{
			}
		}
		CE : Modifier static not allowed here.

5) For construct inheritance and method overriding concept is not applicable but overloading concept is applicable
6) Every class in java including abstract class can contain constructor but interface can not contain constructor.
7) If there is a chance to recursive constructor then we will get compile time exception saying " Recursive constructor invoked"

*Diffenence between Constructor and instance block
1) constructor is use to initialize an object but other than initialization if we want to perform any activityfor every object creation then we should go
   for instance block(like updating one entry at the time of every object creation).
2) Both will be executed at the time of object creation  but instance block first followed by constructor

Q) Wtrite a program to print no of object created for a class
--> 
 class Test
{
	static int count =0;
	{
		count++;
	}
	Test()
	{
	}
	Test(int i)
	{
	}
	Test(double d)
	{
	}

	public static void main(String[] args)
	{
		Test t1 = new Test();
		Test t2 = new Test(10);
		Test t3 = new Test(10.5);
	}
}


*default Constructor:
 Compiler is responsible for create a default constructor(but not JVM) if programmer not writing any constructor then only compiler will generate
   default constructor. i.e. if programmer write a constructor then compiler won't generate default constructor.

Prototype for defualt constructor:
1) It is always no arg contructor
2) Access modifier must me same as class access modifier(This rule is applicable for public and <default>)
3) This constructor contains only one line code i.e super()(call to no arg parent constructor) or this()
4) inside this constructor every line should be either super() or this(). if we are not adding any of these then compiler will always place super()
   (Note :  we can not use super() or this() simultaniously in this constructor.)





