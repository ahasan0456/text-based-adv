/*
*	Author: Amir Hasan
*	Last Updated: 10-29-17
*	Description: Enemy models anything that fights the player in
*				 combat.
*/
public class Enemy extends Player
{
	int attack;
	int defense;
	int health;
	public Enemy(String name, Item[] inventory, int[] coordinates, int health, String monsterType)
	{
		super(name,inventory,coordinates,health,null,Utilities.getRandomInteger(20,50));
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