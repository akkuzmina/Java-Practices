//Name: Mr. May

public class InvokeTester
{
	public static void main(String[] args)
	{
		System.out.println("\nTyring piggyBank() \n");
		
		int p1 = 3, p2 = 4;
		int n1 = 1, n2 = 5;
		int d1 = 4, d2 = 6;
		int q1 = 1, q2 = 7;
		int h1 = 5, h2 = 8;
		
		// Uncomment the next four lines after completing piggyBank()
		int c1 = Invoke.piggyBank(p1, n1, d1, q1, h1);
		int c2 = Invoke.piggyBank(p2, n2, d2, q2, h2);
		System.out.println("Invoke.piggyBank("+p1+", "+n1+", "+d1+", "+h1+"): " + c1);
		System.out.println("Invoke.piggyBank("+p2+", "+n2+", "+d2+", "+h2+"): " + c2);
		
		System.out.println("\nTrying mp3Sizer() \n");
		int s1 = 2000, s2 = 1350;
		int m1 = 25,   m2 = 50;
		int j1 = 1500, j2 = 4000;
		
		// Uncomment the next four lines after completing mp3Sizer()
		int g1 = Invoke.mp3Sizer(s1, m1, j1);
		int g2 = Invoke.mp3Sizer(s2, m2, j2);
		System.out.println("Invoke.mp3Sizer("+s1+", "+m1+", "+j1+"): " + g1);
		System.out.println("Invoke.mp3Sizer("+s2+", "+m2+", "+j2+"): " + g2);
		
	}
}