/*
*	Author: Amir Hasan
*	Last Updated: 11-1-17
*	Description: Food is an Item that gives a Player more health.
*/
public class Food implements Item
{
	public int healAmount;
	public String name;
	public Food(String name, int healAmount)
	{
		this.name=name;
		this.healAmount=healAmount;
	}
	public String useItem()
	{
		return "You eat the "+name+" and gain ";
	}
	public String description()
	{
		return "Health Gain: "+healAmount;
	}
	public String toString()
	{
		return name;
	}
}