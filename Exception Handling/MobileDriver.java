//Program to demonstrate NullPointerException in java

class MobileDriver
{
	static Mobile m1;

	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		try
		{
			MobileDriver.m1.playGames=true;
			MobileDriver.m1.playGames(MobileDriver.m1.playGames);
			//
		}
		catch(NullPointerException npe)
		{
			npe.printStackTrace();
			
			try
			{
				Mobile m1= new Mobile();
				m1.playGames= true;
				m1.playGames(m1.playGames);
		
				m1.watchReels= true;
				m1.watchReels(m1.watchReels);
			}
			catch(Exception e1)
			{
				e1.printStackTrace();
			}
		}
		System.out.println("main ends");
	}
}

