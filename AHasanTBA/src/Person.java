/*
*	Author: Amir Hasan
*	Last Updated: 10-29-17
*	Description: Person is used for any living thing in the game.
*/
public abstract class Person
{
	public String name;
	public Item[] inventory;
	public abstract String greeting();
}