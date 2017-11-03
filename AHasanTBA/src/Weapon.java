/*
*	Author: Amir Hasan
*	Last Updated: 11-2-17
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
		this.attack=attack;
	}
	public String useItem()
	{
		return "You attack with the "+name+" and deal ";
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