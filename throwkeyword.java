import java.util.Scanner;
class throwkeyword
{
	void checkage()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Your age:");
		int age=s.nextInt();
		if(age<18)
		{
			throw new ArithmeticException("you are not eligible!");
		}
		else
		{
			System.out.println("Access granted: You are old enough");
		}
	}
	public static void main(String[]args)
	{
		throwkeyword t=new throwkeyword();
		t.checkage();
	}
}