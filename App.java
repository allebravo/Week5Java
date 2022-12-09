public class App {

	public static void main(String[] args) {
	
		
		
		
		SpacedLogger object = new SpacedLogger();
		System.out.println("Spaced Logger: log () ");
		object.log("Hello");
		object.log("Howdy");
		
		System.out.println(" \nSpacedLogger: error () ");
		object.error("Hello");
		object.error("Howdy");
		
		
		AsteriskLogger object2 = new AsteriskLogger();
		System.out.println(" \n\nAstrisk Logger: log () ");
		object2.log("Hello");
		object2.log("Howdy");
		
		System.out.println(" \nAstrisk Logger: error () ");
		object2.error("Hello");
		object2.error("Howdy");
	}

}