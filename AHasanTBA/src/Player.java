public class Player extends Person
{
	public int[] coordinates;
	public int health;
	public Weapon equippedWeapon;
	public Player(String name, Item[] inventory, int[] coordinates, int health)
	{
		this.name=name;
		this.inventory=inventory;
		this.coordinates=coordinates;
		this.health=health;
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
		return 0;
	}
}