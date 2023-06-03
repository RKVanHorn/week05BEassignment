package week05BEassignment;

public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		System.out.println(String.join(" ", log.split("")));
		
	}

	@Override
	public void error(String error) {
		System.err.println("ERROR: " + String.join(" ", error.split("")));
	}

	
}
