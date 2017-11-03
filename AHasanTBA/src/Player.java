/*
*	Author: Amir Hasan
*	Last Updated: 10-31-17
*	Description: Player is the base for anything that can enter combat and
*				 move around the board as well.
*/
public class Player extends Person
{
	public int[] coordinates;
	public int health;
	public Weapon equippedWeapon;
	public int money;
	public int maxHealth;
	public Player(String name, Item[] inventory, int[] coordinates, int health, int maxHealth, Weapon equippedWeapon, int money)
	{
		this.name=name;
		this.inventory=inventory;
		this.coordinates=coordinates;
		this.health=health;
		this.maxHealth=maxHealth;
		this.equippedWeapon=equippedWeapon;
		this.money=money;
	}
	public Player(String name)
	{
		this.name=name;
		this.inventory=new Item[20];
		this.inventory[0]=Utilities.generateItem();
		this.coordinates=new int[] {0,0};
		this.health=25;
		this.maxHealth=25;
		this.equippedWeapon=new Weapon("Sword of Combat Testing", 50);
		this.money=100;
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
	public void move(int[] shift)
	{
		coordinates[0]+=shift[0];
		coordinates[1]+=shift[1];
	}
}