/*
*	Author: Amir Hasan
*	Last Updated: 11-2-17
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
	private static String[] monsterNames= {"Spooky Skeleton","Scary Ghost", "Giant-ish Spider"};
	private static String[] foodNames= {"Chocolate Bar","Fried Chicken","Burger"};
	public static int findKeyword(String statement, String keyword)
	{
		String x=statement.toLowerCase();
		String y=keyword.toLowerCase();
		int position=x.indexOf(y);
		return position;
	}
	public static Enemy generateEnemy(int level, int[] coordinates)
	{
		int enHealth=getRandomInteger(level*9,level*10);
		Item[] enInventory=new Item[2];
		String enName= monsterNames[getRandomInteger(0,monsterNames.length-1)];
		int enMoney=getRandomInteger(level*7,level*9)+getRandomInteger(enHealth*3,enHealth*6);
		return new Enemy(enName,enInventory,coordinates,enHealth,enHealth,enMoney);
	}
	public static Item generateItem()
	{
		String fName=foodNames[getRandomInteger(0,foodNames.length-1)];
		return new Food(fName,20);
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
	public static Board generateBoard()
	{
		Space[][] spaceArr= new Space[5][5];
		Board board=new Board(spaceArr);
		int shopPos=0;
		for(int row=0;row<spaceArr.length;row++)
		{
			if(row<spaceArr.length-1)
			{
				shopPos=Utilities.getRandomInteger(0,spaceArr[row].length-1);
			}
			else
			{
				shopPos=Utilities.getRandomInteger(0,spaceArr[row].length-2);
			}
			for(int column=0;column<spaceArr[row].length;column++)
			{
				Shop[] shopArr= new Shop[1];
				Enemy[] enemyArr= new Enemy[1];
				if(column==shopPos)
				{
					Shopkeeper shopPerson=new Shopkeeper("Shopkeeper "+Utilities.getRandomName());
					shopArr[0]=new Shop(shopPerson);
				}
				if(column>0&&!(column==spaceArr[row].length-1&&row==spaceArr.length-1))
				{
					enemyArr[0]=generateEnemy(row+1, new int[] {row,column});
				}
				spaceArr[row][column]=new Space(enemyArr, shopArr, new Player[1]);
			}
		}
		return board;
	}
	public static void printMap(Board inBoard)
	{
		String line="";
		for(int x=0;x<inBoard.map.length;x++)
		{
			for(int y=0;y<inBoard.map[x].length;y++)
			{
				line+=inBoard.map[x][y].printSpace()+" ";
			}
			if(x+1==inBoard.map.length)
			{
				line+="<- Exit";
			}
			System.out.println(line);
			line="";
		}
	}
}