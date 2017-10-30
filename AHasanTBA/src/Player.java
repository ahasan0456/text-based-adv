/*
*	Author: Amir Hasan
*	Last Updated: 10-29-17
*	Description: Player is the base for anything that can enter combat and
*				 move around the board as well.
*/
public class Player extends Person
{
	public int[] coordinates;
	public int health;
	public Weapon equippedWeapon;
	public Player(String name, Item[] inventory, int[] coordinates, int health, Weapon equippedWeapon)
	{
		this.name=name;
		this.inventory=inventory;
		this.coordinates=coordinates;
		this.health=health;
		this.equippedWeapon=equippedWeapon;
	}
	public String greeting()
	{
		return "";
	}
	public int defense()
	{
		return 0;
	}
	public int attack()
	{
		return equippedWeapon.attack;
	}
}