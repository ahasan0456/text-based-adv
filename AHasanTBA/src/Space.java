public class Space
{
	public Person[] enemies;
	public Shop[] shops;
	public Player[] players;
	public Space(Person[] enemies, Shop[] shops, Player[] players)
	{
		this.enemies=enemies;
		this.shops=shops;
		this.players=players;
	}
}