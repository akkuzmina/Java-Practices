//name:

public class Invoke
{
	//method piggyBank(): returns what the change is worth in cents
	public static int piggyBank(int p, int n, int d, int q, int h)
	{
		return p + n*5 + d*10 + q*25 + h*50;
	}
	
	//method mp3sizer(): estimates the number of gB needed to store media
	public static int mp3Sizer(int s, int m, int j)
	{
		double g = ((s*3.04 + m*89.3 + j*1.72)/1000);
		return (int) (g+1);
	}
}