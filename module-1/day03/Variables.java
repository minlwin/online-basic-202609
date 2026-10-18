public class Variables {

	// Instant Variable -> Object
	int count;

	// Static Variable -> Class
	static int limit;

	// Instant Method -> Object
	void method1() {
		String temp = "This is Temp"; // Local Variable
		System.out.println(count);
		System.out.println(limit);
		System.out.println(temp);
	}

	void otherMethod() {
		method1();

		int result = method2(3);
		System.out.println("Result : " + result);
	}

	// Static Method -> Class
	static int method2(int data) { // Local Variable

		for(int i = 0; i < data; i ++) {
			System.out.println(i);
		}

		return limit * data;
	}

	public static void main(String[] args) {
		method2(1);
		System.out.println("Limit : " + limit);
	}
}