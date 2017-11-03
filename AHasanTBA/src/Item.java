/*
*	Author: Amir Hasan
*	Last Updated: 10-31-17
*	Description: Item can be anything that is stored in an inventory.
*/
public interface Item
{
	public abstract String useItem();
	public abstract String description();
	public abstract String toString();
}