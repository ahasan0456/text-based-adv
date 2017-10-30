/*
*	Author: Amir Hasan
*	Last Updated: 10-29-17
*	Description: Item can be anything that is stored in an
*				 inventory.
*/
public interface Item
{
	public abstract void useItem(Player target);
	public abstract String description();
}