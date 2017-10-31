/*
*	Author: Amir Hasan
*	Last Updated: 10-31-17
*	Description: This is the file to run the project. Obviously.
*/
import java.util.Scanner;
public class Runner
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("What is your name?");
		String name=input.nextLine();
		System.out.println("Welcome, "+name+"!");
		System.out.println("The objective of this game is to get to the exit at the opposite corner of the map.");
		System.out.println("You must level up and equip better gear first, however, as many monsters and foes stand in your way.");
		System.out.println("Good luck, "+name+"!");
		System.out.println("Initializing game...");
		boolean lose=false;
		boolean inBattle=false;
		boolean inShop=false;
		Board world=generateBoard();
		Player player1=new Player(name);
		world.map[0][0].players[0]=player1;
		System.out.println("Game started!");
		System.out.println("You have started in the easy area, all the way northwest.");
		System.out.println("Which direction would you like to go first?");
		while(!lose)
		{
			String response=input.nextLine();
			if(!inBattle&&!inShop)
			{
				if(Utilities.findKeyword(response,"North")>=0||Utilities.findKeyword(response,"Up")>=0)
				{
					world.map[player1.coordinates[0]][player1.coordinates[1]].players[0]=null;
					player1.move(shiftNorth);
					if(player1.coordinates[0]<0)
					{
						player1.move(shiftSouth);
						System.out.println("You cannot move that way, as it is out of the playable area.");
					}
					else
					{
						System.out.println("You have moved north.");
					}
					world.map[player1.coordinates[0]][player1.coordinates[1]].players[0]=player1;
				}
				else if(Utilities.findKeyword(response,"East")>=0||Utilities.findKeyword(response,"Right")>=0)
				{
					world.map[player1.coordinates[0]][player1.coordinates[1]].players[0]=null;
					player1.move(shiftEast);
					if(player1.coordinates[1]>world.map.length-1)
					{
						player1.move(shiftWest);
						System.out.println("You cannot move that way, as it is out of the playable area.");
					}
					else
					{
						System.out.println("You have moved east.");
					}
					world.map[player1.coordinates[0]][player1.coordinates[1]].players[0]=player1;
				}
				else if(Utilities.findKeyword(response,"South")>=0||Utilities.findKeyword(response,"Down")>=0)
				{
					world.map[player1.coordinates[0]][player1.coordinates[1]].players[0]=null;
					player1.move(shiftSouth);
					if(player1.coordinates[0]>world.map.length-1)
					{
						player1.move(shiftNorth);
						System.out.println("You cannot move that way, as it is out of the playable area.");
					}
					else
					{
						System.out.println("You have moved south.");
					}
					world.map[player1.coordinates[0]][player1.coordinates[1]].players[0]=player1;
				}
				else if(Utilities.findKeyword(response,"West")>=0||Utilities.findKeyword(response,"Left")>=0)
				{
					world.map[player1.coordinates[0]][player1.coordinates[1]].players[0]=null;
					player1.move(shiftWest);
					if(player1.coordinates[1]<0)
					{
						player1.move(shiftEast);
						System.out.println("You cannot move that way, as it is out of the playable area.");
					}
					else
					{
						System.out.println("You have moved west.");
					}
					world.map[player1.coordinates[0]][player1.coordinates[1]].players[0]=player1;
				}
			}
			if(player1.health==0)
			{
				lose=true;
				System.out.println("You have lost all your health and fainted. Game over.");
			}
		}
		input.close();
	}
	public static Board generateBoard()
	{
		Space[][] spaceArr= new Space[5][5];
		Board board=new Board(spaceArr);
		for(int row=0;row<spaceArr.length;row++)
		{
			int shopPos=Utilities.getRandomInteger(0,spaceArr[row].length);
			for(int column=0;column<spaceArr[row].length;column++)
			{
				Shop[] shopArr= new Shop[1];
				if(column==shopPos)
				{
					Shopkeeper shopPerson=new Shopkeeper("Shopkeeper "+Utilities.getRandomName());
					shopArr[0]=new Shop(shopPerson);
				}
				spaceArr[row][column]=new Space(new Enemy[3], shopArr, new Player[1]);
			}
		}
		return board;
	}
	public static int[] shiftNorth= {-1,0};
	public static int[] shiftEast= {0,1};
	public static int[] shiftWest= {0,-1};
	public static int[] shiftSouth= {1,0};
}