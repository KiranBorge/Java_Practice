class HashCodeDemo
{
	int i;
	
	/*public String toString()
	{
		return i+" ";
	}
	*/public int hashCode()
	{
		return i;
	} 
	public static void main(String[] args)
	{
		HashCodeDemo d1 = new HashCodeDemo(10);
		HashCodeDemo d2 = new HashCodeDemo(101);
		System.out.println(d1);
		System.out.println(d2);
	}
	HashCodeDemo(int i)
	{
		this.i = i;
	}
}

/*
Output:
if no hashCode and toString method override

HashCodeDemo@1db9742
HashCodeDemo@106d69c

if we override hashCode method

HashCodeDemo@a
HashCodeDemo@65

if we override hashCode and toString method

10
100

*/
