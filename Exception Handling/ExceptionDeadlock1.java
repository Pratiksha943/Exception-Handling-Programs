class ExceptionDeadlock1
{
	public static void main(String[] args) 
	{
		System.out.println("Exe starts");	
		try
		{
			System.out.println("try");
			Thread.sleep(1000);
		}
		catch(InterruptedException i)
		{
			System.out.println("Interrupted Exception handled");
			System.exit(0);
		}
		finally
		{
			System.out.println("Hello from finally");
		}
		System.out.println("Exe ends");	
	}
}

