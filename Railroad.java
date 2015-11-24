
public class Railroad extends Space
{
	public Railroad(String name, int location)
	{
		super(name, location);
	}

	@Override
	public void performRole(Player player) 
	{
		player.takeTurn();
	}
}
