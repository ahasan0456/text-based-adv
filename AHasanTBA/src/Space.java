/*
*	Author: Amir Hasan
*	Last Updated: 10-29-17
*	Description: Space is used as one section of the board.
*/
public class Space
{
	public Enemy[] enemies;
	public Shop[] shops;
	public Player[] players;
	public Space(Enemy[] enemies, Shop[] shops, Player[] players)
	{
		this.enemies=enemies;
		this.shops=shops;
		this.players=players;
	}
	public void printSpace()
	{
		
	}
}