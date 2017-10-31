/*
*	Author: Amir Hasan
*	Last Updated: 10-31-17
*	Description: Weapon is used for any item that can be equipped
*				 that has an attack stat.
*/
public class Weapon implements Item
{
	String name;
	int attack;
	public Weapon(String name, int attack)
	{
		this.name=name;
	}
	public void useItem(Player target)
	{
		target.health-=(attack-target.defense());
	}
	public String description()
	{
		return "Weapon Name: "+name+", Attack: "+attack;
	}
	public String toString()
	{
		return name;
	}
}