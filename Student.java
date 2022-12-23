class info1
{
	void get()
	{
		int rollno = 12;
		System.out.println("Roll No:"+rollno);
	}
}
class info2
{
	void set()
	{
		String name = "Om";
		System.out.println("Name:"+name);
	}
}
class Student
{
	public static void main (String args[ ])
	{
		info1 s1 = new info1();
		s1.get();
		info2 s2 = new info2();
		s2.set();
	}
}