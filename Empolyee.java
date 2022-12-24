class info1
{
	void get()
	{
		int emp_id = 102 ;
		System.out.println("Employee Id :"+emp_id);
	}
}
class Empolyee extends info1
{
	void set()
	{
		String emp_name = "Shree";
		System.out.println("Employee Name :"+emp_name);
	}
	public static void main (String args[ ])
	{
		Empolyee e2 = new  Empolyee();
		e2.get();
		e2.set();

	}
}