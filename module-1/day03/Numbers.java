public class Numbers {
	// Method Signature = Method Name + Argument List
	// take(byte)
	static void take(byte data) {
		System.out.println("Byte Data");
	}

	// take(short)
	static void take(short data) {
		System.out.println("Short Data");
	}	

	// take(int)
	static void take(int data) {
		System.out.println("Integer Data");
	}	

	// take(long)
	static void take(long data) {
		System.out.println("Long Data");
	}


	static void take(float data) {
		System.out.println("Float Data");
	}

	static void take(double data) {
		System.out.println("Double Data");
	}

	public static void main(String[] args) {
		take(10L);
		take(0.1F);
	}
}