public class Enemy extends Player
{
	int attack;
	int defense;
	int health;
	public Enemy(String name, Item[] inventory, int[] coordinates, int health, String monsterType)
	{
		super(name,inventory,coordinates,health);
		this.name=name;
	}
	public int attack()
	{
		return 0;
	}
	public int defense()
	{
		return 0;
	}
}