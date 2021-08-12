import java.util.Random;

public class Main 
{
	public static Simulation simulation = new Simulation();
	
	public static int Random(int min, int max)
	{
		assert(min >= 0 && max >= 0);
		Random rand = new Random();
		return (rand.nextInt(Math.abs(max - min) + 1) + min);
	}
	
	public static int RandomSign(int n)
	{
		Random rand = new Random();
		return rand.nextBoolean() ? n:(-n);
	}
	
	public static boolean RandomBool()
	{
		Random rand = new Random();
		return rand.nextBoolean();
	}
	
	public static void main(String[] args)
	{
	}
}

