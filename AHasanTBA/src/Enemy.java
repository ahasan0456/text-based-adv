/*
*	Author: Amir Hasan
*	Last Updated: 11-1-17
*	Description: Enemy models anything that fights the player in combat.
*/
public class Enemy extends Player
{
	private int attack;
	private int defense;
	public int health;
	public Enemy(String name, Item[] inventory, int[] coordinates, int health, int maxHealth, int money)
	{
		super(name,inventory,coordinates,health,maxHealth,null,money);
		this.name=name;
		this.inventory=inventory;
		this.coordinates=coordinates;
		this.health=health;
		this.maxHealth=maxHealth;
		this.equippedWeapon=null;
		this.money=money;
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