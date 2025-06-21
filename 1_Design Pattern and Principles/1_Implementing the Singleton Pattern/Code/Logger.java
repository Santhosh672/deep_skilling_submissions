package singleton;

public class Logger {
	
	//creating a private instance variable
	private static Logger instance;
	
	//private constructor to prevent object creation from other classes
	private Logger() {
		System.out.println("Logger Initiated");
	}
	
	//returning the same instance for every object
	public static Logger getInstance() {
		if (instance==null) {
			instance = new Logger();
		}
		return instance;
	}
	
	//sample message
	public void log(String message) {
		System.out.println("Log: " + message);
	}
}
