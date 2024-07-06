class ExceptionDeadlock
{
	public static void main(String[] args) 
	{
		System.out.println("Exe starts");	
		try
		{
			Thread.CurrentThread.join();
		}
		catch(InterruptedException i)
		{
			System.out.println("Interrupted Exception handled");
		}
		finally
		{
			System.out.println("Hello from finally");
		}
		System.out.println("Exe ends");	
	}
}

