package codingAssignmentWeek5;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String newMessage = "Test"; //message to pass into methods
		
		Logger logMsg = new AsteriskLogger();//calls on the interface, assigns a name, instantiates a new class object
		logMsg.log(newMessage);//uses the new variable hooked to the interface to implement the method & pass in the argument set above.
		
		System.out.println();//console formatting
		
		Logger errorMsg = new AsteriskLogger();
		errorMsg.error(newMessage);
		
		System.out.println();//console formatting
		
		Logger spacedLogMsg = new SpacedLogger();
		spacedLogMsg.log(newMessage);
		
		System.out.println();//console formatting
		
		Logger spacedErrorMsg = new SpacedLogger();
		spacedErrorMsg.error(newMessage);
		
	}

}
