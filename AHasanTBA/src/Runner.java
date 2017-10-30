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
		Player player1=new Player(name, new Item[10], startPos, 25);
		input.close();
	}
	public static int[] startPos= {0,0};
}