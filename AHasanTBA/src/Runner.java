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
		Player player1=new Player(name, new Item[10]);
		input.close();
	}
}