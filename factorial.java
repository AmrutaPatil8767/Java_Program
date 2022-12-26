class factorial
{
	public static void main (String args[])
	{
		int i=1,f=1,no=5;
		do
		{
			f=f*i;
			i++;
		}
		while(i<=no);
		System.out.println("Factoial :"+f);
	}
}
			