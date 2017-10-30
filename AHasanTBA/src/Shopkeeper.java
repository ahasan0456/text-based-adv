/*
*	Author: Amir Hasan
*	Last Updated: 10-29-17
*	Description: Shopkeeper is a type of person that sells items
*				 in shops.
*/
public class Shopkeeper extends Person
{
	public String greeting()
	{
		return "Welcome to my shop!";
	}
	public Shopkeeper(String name)
	{
		this.name=name;
	}
}