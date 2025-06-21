package singleton;

public class Test {

	public static void main(String[] args) {
		Logger log1 = Logger.getInstance();
		Logger log2 = Logger.getInstance();
		
		log1.log("Message 1");
		log2.log("Message 2");
		
		//checking if both object returns the same instance of the class
		if (log1 == log2) {
            System.out.println("Both logger instances are the same - Singleton working.");
        } else {
            System.out.println("Different instances - Singleton failed.");
        }

	}

}
