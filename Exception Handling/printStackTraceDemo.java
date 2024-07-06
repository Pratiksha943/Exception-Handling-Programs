import java.io.*;
class printStackTraceDemo
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println(args[0]);
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			ae.printStackTrace();
		}
	}
}