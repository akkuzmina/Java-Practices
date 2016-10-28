public class StringHelperTester
{
	public static void main(String[] args)
	{
		StringHelperTester.testReplaceMethod();
		StringHelperTester.testReplaceAllMethod();
	}
	
	public static void testReplaceMethod()
	{
		System.out.println("Testing replace() method");
		
		String test1 = StringHelper.replace("Trek", "Wars", "Star Trek Rules");
		System.out.println("replace(\"Trek\", \"Wars\", \"Star Trek Rules\") returned: " + test1);
		
		String test2 = StringHelper.replace("Super", "Bat", "Superman");
		System.out.println("replace(\"Super\", \"Bat\", \"Superman\") returned: " + test2);
		
		String test3 = StringHelper.replace("man", "girl", "Batman");
		System.out.println("replace(\"man\", \"girl\", \"Batman\") returned: " + test3);
		
		String test4 = StringHelper.replace("r", "*", "Super Mario Bros");
		System.out.println("replace(\"r\", \"*\", \"Super Mario Bros\") returned: " + test4);
	
		String test5 = StringHelper.replace("Link", "Gannon", "Legend of Zelda");
		System.out.println("replace(\"Link\", \"Gannon\", \"Legend of Zelda\") returned: " + test5);
	}
	
	public static void testReplaceAllMethod()
	{
		System.out.println("Testing replaceAll() method");
		
		String test1 = StringHelper.replaceAll("baby", "bieber", "baby, baby, baby oh Like baby, baby, baby no Like baby, baby, baby no oh");
		System.out.println("replace(\"baby\", \"bieber\", \"baby, baby, baby oh Like baby, baby, baby no Like baby, baby, baby no oh\") returned: " + test1);
		
		String test2 = StringHelper.replaceAll("r", "*", "Super Mario Bros");
		System.out.println("replace(\"r\", \"*\", \"Super Mario Bros\") returned: " + test2);
	}
}