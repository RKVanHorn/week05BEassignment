package week05BEassignment;

public class App {

	public static void main(String[] args) {
		Logger astLogger = new AsteriskLogger();
		astLogger.log("Mom Win!");
		astLogger.error("Mom fail");
		astLogger.error("I fear you've made a grave error");
		
		
		Logger spcLogger = new SpacedLogger();
		spcLogger.log("TACOCAT");
		spcLogger.error("This is an error");
		
	}

}
