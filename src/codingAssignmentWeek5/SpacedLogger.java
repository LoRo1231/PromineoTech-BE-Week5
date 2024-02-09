package codingAssignmentWeek5;

public class SpacedLogger implements Logger{
	
	/* Note:  The SpacedLogger should add a space or " " between each character of 
the String argument passed into its methods.


a. If the log method received “Hello” as an argument, it should print H e l l o

b. The error method should do the same, but with “ERROR:” preceding the spaced out 
input (i.e. ERROR: H e l l o)
*/

	
	@Override
	public void log(String log) {
		// TODO Auto-generated method stub
		
		String spacedLog = addSpace(log);
		
		System.out.println(spacedLog);
		
	}

	
	
	@Override
	public void error(String error) {
		// TODO Auto-generated method stub
		
		String spacedLog = addSpace(error);
		
		System.out.println("ERROR:" + spacedLog);
	}
	
	
	
	// METHOD: For adding spaces
	
	private String addSpace (String message) {
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < message.length(); i++) {
			sb.append(message.charAt(i)).append(" ");
		}
		
		
		return sb.toString();
	}

}
