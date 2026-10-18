public class ExpressionStatement {

	public static void main(String[] args) {
		// Declaration Statement
		int count;
		// Assignment Expression
		count = 10;

		count ++;

		showData(count);
	}

	static void showData(int data) {
		// Method Invocation Expression
		System.out.println("Data is " + data);
	}
}