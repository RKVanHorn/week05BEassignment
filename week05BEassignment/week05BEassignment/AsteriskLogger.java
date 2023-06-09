package week05BEassignment;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String log) {
		System.out.println("***"+log+"***");
		
	}

	@Override
	public void error(String error) {
		StringBuilder astLength = new StringBuilder();
		
		for(int i = 0; i<error.length() + 13; i++) {
			astLength.append("*");
		} astLength.toString();
		System.err.println(astLength+"\n" + "***Error: " + error + "***\n" + astLength);
		
		
		
//		System.err.println("***************");
//		System.err.println("***Error: " + error + "***");
//		System.err.println("***************");
		
	}

}
