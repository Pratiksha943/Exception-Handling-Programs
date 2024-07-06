class ExceptionInClassBlock
{
	try
	{
		System.out.println(10/0);
	}
	catch(ArithmeticException ae)
	{
		System.out.println("ArithmeticException handled");
	}
	public static void main(String[] args) 
	{
		
	}
}