class finallyblock
{
	 public static void main(String [ ] args)
 	{
	 try
 		{
 			int[] mynumber={1,2,3};
 			System.out.println(mynumber[1]);
 		}
	 catch(Exception e)
 		{
 			System.out.println("Something went wrong");
 		}
 	finally
 		{
			 System.out.println("The try catch is finished");
 		}
 	}
}
