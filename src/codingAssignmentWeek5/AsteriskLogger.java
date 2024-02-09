package codingAssignmentWeek5;

public class AsteriskLogger  implements Logger{

	@Override
	public void log(String log) {
		// TODO Auto-generated method stub
		
		/* a.  The log method on the AsteriskLogger should print out the String it 
	receives between 3 asterisks on either side of the String 
	(e.g. if the String passed in is “Hello”, then it should print 
	***Hello*** to the console).*/
		
		System.out.println("***" + log + "***");
		
	}

	@Override
	public void error(String error) {
		// TODO Auto-generated method stub
		
		/* b. The error method on the AsteriskLogger should print the String 
		 * it receives inside a box of asterisks, with the String preceded by 
		 * the word “ERROR:”. For example, if “Hello” is the argument, 
		 * the following should be printed:
		 * 	****************

		 	***Error: Hello***

		 	**************** */
		
		
		String message = String.format("*** Error: %s ***", error); // %s is a place holder for a string that will pass in 
																	// the param (in this case error message)
		
		String stars = ""; //setting stars to an empty string so we can add characters to it
		String lf = System.lineSeparator(); //setting the line separator to a variable so it is shorter to use
		
		for (int i = 0; i < message.length(); i++) { //iterating through the length of the message and adding an * for each char
			stars += "*";
		}
		
		System.out.println(stars + lf + message + lf + stars); //concat. it all together using line separator for formatting
		
		
		
	}

}
