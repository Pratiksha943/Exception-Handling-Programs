class UserClassCastEx extends RuntimeException
{
	UserClassCastEx(String desc)
	{
		super(desc);
	}	
}

class Parent
{

}
class Child extends Parent
{

}
class UserClassCastExceptionDriver 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		Parent p = new Parent();
		try
		{	
			Child c=(Child)p;	
		}
		
		catch(ClassCastException cce)
		{
			try
			{
				throw new UserClassCastEx("Can not cast Parent Type Object to Child Type Object");
			}
			catch(UserClassCastEx ucce)
			{
				ucce.printStackTrace();
			}
		}
		System.out.println("Main method ended");
	}
}
