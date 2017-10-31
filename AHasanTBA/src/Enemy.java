/*
*	Author: Amir Hasan
*	Last Updated: 10-31-17
*	Description: Enemy models anything that fights the player in combat.
*/
public class Enemy extends Player
{
	private int attack;
	private int defense;
	public int health;
	public Enemy(String name, Item[] inventory, int[] coordinates, int health, int maxHealth)
	{
		super(name,inventory,coordinates,health,maxHealth,null,Utilities.getRandomInteger(20,50));
		this.name=name;
	}
	public int attack()
	{
		return attack;
	}
	public int defense()
	{
		return defense;
	}
	public String greeting()
	{
		return "Bwaah!!!";
	}
}