class Mobile
{
	boolean playGames;
	boolean watchReels;

	void playGames(boolean playGames)
	{
		this.playGames = playGames;
		if(playGames=true)
			System.out.println("Game started");
		else
			System.out.println("Can not Play Game");
	}

	void watchReels(boolean watchReels)
	{
		this.watchReels = watchReels;
		if(watchReels=true)
			System.out.println("Enjoy Reels");
		else
			System.out.println("Can not watch Reels");
	}
}