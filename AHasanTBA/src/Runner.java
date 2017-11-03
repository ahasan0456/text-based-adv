/*
*	Author: Amir Hasan
*	Last Updated: 11-2-17
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
		boolean win=false;
		Shop currentShop=null;
		Enemy currentEnemy=null;
		Board world=Utilities.generateBoard();
		Space currentSpace=world.map[0][0];
		Player player1=new Player(name);
		world.map[0][0].players[0]=player1;
		System.out.println("Game started!");
		System.out.println("You have started in the easy area, all the way northwest.");
		System.out.println("Which direction would you like to go first?");
		while(!lose&&!win)
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
					currentSpace=world.map[player1.coordinates[0]][player1.coordinates[1]];
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
						if(player1.coordinates[0]==world.map.length-1&&player1.coordinates[1]==world.map[world.map.length-1].length-1)
						{
							win=true;
						}	
					}
					world.map[player1.coordinates[0]][player1.coordinates[1]].players[0]=player1;
					currentSpace=world.map[player1.coordinates[0]][player1.coordinates[1]];
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
						if(player1.coordinates[0]==world.map.length-1&&player1.coordinates[1]==world.map[world.map.length-1].length-1)
						{
							win=true;
						}
					}
					world.map[player1.coordinates[0]][player1.coordinates[1]].players[0]=player1;
					currentSpace=world.map[player1.coordinates[0]][player1.coordinates[1]];
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
					currentSpace=world.map[player1.coordinates[0]][player1.coordinates[1]];
				}
				else if(Utilities.findKeyword(response, "map")>=0)
				{
					Utilities.printMap(world);
				}
				else if(Utilities.findKeyword(response, "Enter")>=0&&Utilities.findKeyword(response, "shop")>=0)
				{
					if(currentSpace.shops[0]!=null)
					{
						System.out.println("You have entered the shop.");
						currentShop=world.map[player1.coordinates[0]][player1.coordinates[1]].shops[0];
						inShop=true;
						System.out.println(currentShop.shopkeeper.name+" says: "+currentShop.shopkeeper.greeting());
					}
					else
					{
						System.out.println("There is no shop here.");
					}
				}
				else
				{
					System.out.println("That is not a valid command. Try something else.");
				}
			}
			else if(inShop)
			{
				if(Utilities.findKeyword(response, "Exit")>=0||Utilities.findKeyword(response, "Leave")>=0)
				{
					inShop=false;
					System.out.println("You have exited the shop.");
				}
			}
			else if(inBattle)
			{
				if(currentEnemy.health<=0)
				{
					inBattle=false;
					System.out.println("You have defeated the "+currentEnemy.name+"!");
				}
			}
			if(player1.health==0)
			{
				lose=true;
				System.out.println("You have lost all your health and fainted. Game over.");
			}
			if(win)
			{
				System.out.println("Congratulations! You have made it to the exit.");
			}
		}
		input.close();
	}
	public static int[] shiftNorth= {-1,0};
	public static int[] shiftEast= {0,1};
	public static int[] shiftWest= {0,-1};
	public static int[] shiftSouth= {1,0};
}