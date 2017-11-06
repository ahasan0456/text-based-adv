/*
*	Author: Amir Hasan
*	Last Updated: 11-2-17
*	Description: Enemy models anything that fights the player in combat.
*/
public class Enemy extends Player
{
	private int attack;
	private int defense;
	public int health;
	public Enemy(String name, Item[] inventory, int[] coordinates, int health, int money, int attack)
	{
		super(name,inventory,coordinates,health,health,null,money);
		this.name=name;
		this.inventory=inventory;
		this.coordinates=coordinates;
		this.health=health;
		this.maxHealth=health;
		this.equippedWeapon=null;
		this.money=money;
		this.attack=attack;
	}
	public int attack()
	{
		return attack;
	}
	public int defense()
	{
		return 0;
	}
	public String greeting()
	{
		return "Grrr!!!";
	}
}
