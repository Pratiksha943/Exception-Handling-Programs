class ExceptiontoString
{
	public static void main(String[] args) 
	{
		Thread.currentThread().setName("Pratiksha");
		try
		{
			String a = null;
			System.out.println(a.isEmpty());
		}
		catch(NullPointerException npe)
		{
			System.out.println(npe);
			System.out.println(npe.toString());
		}
		
	}
}
