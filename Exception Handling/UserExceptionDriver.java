import java.util.Scanner;
class UserNullPointerEx extends RuntimeException
{
	UserNullPointerEx(String desc)
	{
		super(desc);
	}
}

class Student
{
	String name;
	String nplace;
	Student(String name,String nplace)
	{
		this.name = name;
		this.nplace = nplace;
	}
}

class UserExceptionDriver
{
	public static void main(String[] args) 
	{
		Student obj = new Student("Pratiksha ","Pune");
		System.out.println(obj.name);
		Student obj1 = null;
		if(obj1==null)
		{
			try
			{
				throw new UserNullPointerEx("Object is null.");
			}
			catch(UserNullPointerEx unpe)
			{
				System.out.println(unpe.getMessage());
			}
		}
		else
		{
			System.out.println(obj1.name);
		}	
	}
}