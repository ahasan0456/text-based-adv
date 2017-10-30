/*
*	Author: Amir Hasan
*	Last Updated: 10-29-17
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
		Board world=generateBoard();
		Player player1=new Player(name, new Item[10], startPos, 25, new Weapon("Wooden Sword",5));
		world.map[0][0].players[0]=player1;
		System.out.println("Game started!");
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
	public static int[] startPos= {0,0};
}