/*
*	Author: Amir Hasan
*	Last Updated: 10-29-17
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
	public static int findKeyword(String statement, String keyword)
	{
		String x=statement.toLowerCase();
		String y=keyword.toLowerCase();
		int position=x.indexOf(y);
		return position;
	}
}