import java.util.Scanner;
class DivisionByZeroEx extends ArithmeticException
{
	DivisionByZeroEx(String desc)
	{
		super(desc);
	}
}

	class CustomizedException
	{
		public static void main(String[] args) 
		{
			System.out.println("Division");
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter num1 : ");
			int num1 = sc.nextInt();
			System.out.print("Enter num2 : ");
			int num2 = sc.nextInt();
			
			if(num2==0)
			{
				try
				{
					throw new DivisionByZeroEx("Can not divide a number by zero. ");
				}
				catch(DivisionByZeroEx de)
				{
					System.out.println(de.getMessage());
				}
				
			}
			else
				System.out.println(num1/num2);

		}
	}


