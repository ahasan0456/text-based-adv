/*
*	Author: Amir Hasan
*	Last Updated: 10-31-17
*	Description: Utilities is used for generic methods that can be used by all
*				 classes if necessary.
*/
public class Utilities
{
	public static int getRandomInteger(int low, int high)
	{
		if(low>high)
		{
			int swap=low;
			low=high;
			high=swap;
		}
		return (int)(Math.random()*(high-(low-1))+low);
	}
	public static String getRandomName()
	{
		return randomNames[getRandomInteger(0,randomNames.length-1)];
	}
	private static String[] randomNames= {"John","Jane","Mary","Joseph","Alex","Anne"};
	private static String[] weaponNames= {"Baseball Bat", "Huge Pencil","Golf Club"};
	public static int findKeyword(String statement, String keyword)
	{
		String x=statement.toLowerCase();
		String y=keyword.toLowerCase();
		int position=x.indexOf(y);
		return position;
	}
	public static Enemy generateEnemy(int level)
	{
		int enHealth=getRandomInteger(level*10,level*15);
		return new Enemy();
	}
	public static Item generateItem()
	{
		return new Item();
	}
	public static Weapon generateWeapon(int level)
	{
		double prob=Math.random();
		int rarity;
		if(prob<0.8)
		{
			rarity=0;
		}
		else if(prob<0.925)
		{
			rarity=1;
		}
		else
		{
			rarity=2;
		}
		int weapAttack=getRandomInteger(level*5,level*7)+(rarity*getRandomInteger(level*3,level*5));
		String weapName=weaponNames[getRandomInteger(0,weaponNames.length-1)];
		return new Weapon(weapName,weapAttack);
	}
}