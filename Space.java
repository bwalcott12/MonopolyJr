/**
 * This class is a representation of a Space on the board.
 * A space has a name and location.
 * 
 * @author Chase
 *
 */
public abstract class Space 
{
	private String _name;
	private int _location;
	
	public Space(String name, int location)
	{
		_name = name;
		_location = location;
	}
	
	public String getName()
	{
		return _name;
	}
	
	public int getLocation()
	{
		return _location;
	}
	
	
	/**
	 * Override this method in order to cause the 
	 * space to act on a specified player. This can
	 * be used to cause a player to draw a chance, buy
	 * a property, or pay money
	 */
	abstract public void performRole(Player player);
}
