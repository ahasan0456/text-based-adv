public class Weapon implements Item
{
	String name;
	int attack;
	public Weapon(String name)
	{
		this.name=name;
	}
	public void useItem(Player target)
	{
		target.health-=attack;
	}
	public String description()
	{
		return "";
	}
}