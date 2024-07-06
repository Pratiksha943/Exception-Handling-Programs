import java.util.Scanner;
class UserNullPointerEx extends RuntimeException
{
	UserNullPointerEx(String desc)
	{
		super(desc);
	}	
}

class CustomizedExceptionDriver
{
	static UserNullPointerEx obj;
							
	public static void main(String[] args) 
	{
			if(obj==null)
			{
				try
				{
					throw new UserNullPointerEx("Object is null. ");
				}
				catch(UserNullPointerEx npe)
				{
					System.out.println(npe.getMessage());
				}
				
			}
				else
					System.out.println(obj);
			
		}
}


