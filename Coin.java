import java.util.Random;

public class Coin {

	private static String sideUp;
	
	public Coin()
	
	{
		toss();
	}
	
	public static void toss()
	
	{
		
		Random rand=new Random();
		
	int value=rand.nextInt(2);
	
	if ( value==0)
	sideUp="heads";
	
	else if (value==1)
	sideUp="tails";
	
	}
	
	
	public static String getSideUp()
	{
		return sideUp;
	}
	
	
	
	
	
	
}
