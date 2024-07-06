class NestedTryCatchInsideTry
{
	public static void main(String[] args) 
	{
		System.out.println("hiii");	
		try
		{
			System.out.println("Outer try");

			try
			{
				String[] arr = new String[0];
				System.out.print(arr[1]);
			}
			catch (ClassCastException cce) 
			{
				System.out.println("Inner Catch");	
			}
		}
		//class(Exception e)
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Outer catch 2");
		}
	}
	
}

