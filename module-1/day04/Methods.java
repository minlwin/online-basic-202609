public class Methods {

	static final int MAX_VALUE = 5;
	static int value;

	static void increment() {

		if(value == MAX_VALUE) {
			System.out.println("Value reach max value.");
			// return statement must be last statement 
			// of existing code block
			return;
		}

		value ++;
		System.out.println("Value : " + value);
	}

	int getValue() {
		return value;
	}
}