public class Utilities
{
	public int getRandomInteger(int low, int high)
	{
		if(low>high)
		{
			int swap=low;
			low=high;
			high=swap;
		}
		return (int)(Math.random()*(high-(low-1))+low);
	}
	public String getRandomName()
	{
		return randomNames[getRandomInteger(0,randomNames.length)];
	}
	private String[] randomNames= {"John","Jane","Mary","Joseph","Alex","Anne"};
}