/*
*	Author: Amir Hasan
*	Last Updated: 11-2-17
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
	public String printSpace()
	{
		String spaceStr="[";
		if(enemies[0]!=null)
		{
			spaceStr+="E";
		}
		else
		{
			spaceStr+=" ";
		}
		if(players[0]!=null)
		{
			spaceStr+="P";
		}
		else
		{
			spaceStr+=" ";
		}
		if(shops[0]!=null)
		{
			spaceStr+="S";
		}
		else
		{
			spaceStr+=" ";
		}
		spaceStr+="]";
		return spaceStr;
	}
}