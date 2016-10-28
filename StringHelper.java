//name:

public class StringHelper
{
	public static String replace(String needle, String replacement, String haystack)
	{
		int nLength = needle.length();
		int nIndx = haystack.indexOf(needle);
		if (nIndx != -1)
		{
		String leftPart = haystack.substring(0,nIndx);
		String rightPart = haystack.substring(nLength+nIndx);
		String newString = leftPart+replacement+rightPart;
		return newString;
		}
		else
			return haystack;
	}
	
	public static String replaceAll(String needle, String replacement, String haystack)
	{
		while (haystack.indexOf(needle) != -1)
		{
			haystack = replace(needle, replacement, haystack);
		}
		return haystack;
	}
}