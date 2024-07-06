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
		try
		{
			Parent p = new Parent();
			Child c = (Child)p;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Main method ended");
	}
}
