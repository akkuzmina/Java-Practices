/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement){
		String response = "";
		statement = statement.trim();
		if (statement.equals(""))
			response = "Please say something.";
		else if (statement.indexOf("hi") >= 0
				|| statement.indexOf("hello") >= 0
				|| statement.indexOf("sup") >= 0
				|| statement.indexOf("hey") >= 0)
			response = "What's on your mind?";
		else if (statement.indexOf("annoying") >= 0)
			response = "You're the annoying one.";
		else if (statement.indexOf("no") >= 0)
			response = "Why so negative?";
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
			response = "Tell me more about your family.";
		else if (statement.indexOf("dog") >= 0
				|| statement.indexOf("cat") >= 0)
			response = "Tell me more about you pets.";
		else if (statement.indexOf("Mr. May") >= 0)
			response = "He sounds like a good teacher.";
		else if (statement.indexOf("me") >= 0)
			response = "Wow, way to always talk about yourself, human.";
		else if (statement.indexOf("food") >= 0)
			response = "Now I'm hungry, thanks.";
		else
			response = getRandomResponse();
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse(){
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
			response = "Interesting, tell me more.";
		else if (whichResponse == 1)
			response = "Hmmm.";
		else if (whichResponse == 2)
			response = "Do you really think so?";
		else if (whichResponse == 3)
			response = "You don't say.";
		else if (whichResponse == 4)
			response = "Wow.";
		else if (whichResponse == 5)
			response = "I didn't know humans could be so boring.";
		else if (whichResponse == 6)
			response = "Yawn.";

		return response;
	}
}
