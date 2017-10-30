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
		return randomNames[getRandomInteger(0,randomNames.length)];
	}
	private static String[] randomNames= {"John","Jane","Mary","Joseph","Alex","Anne"};
}