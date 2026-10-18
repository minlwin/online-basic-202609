public class InstanceVsStatic {
	public static void main(String[] args) {
		var demo1 = new Demo("Demo 1");
		var demo2 = new Demo("Demo 2");

		demo1.increment();
		demo2.increment();
 	}
}

class Demo {
	String name;
	int instanceValue;
	static int staticValue;
	
	Demo(String name) {
		// Variable Hiding
		// Can't seen outer scope variable (name)
		this.name = name;
	}

	void increment() {
		instanceValue ++;
		staticValue ++;

		System.out.println("Increment of " + name);
		System.out.println("Instance Value : " + instanceValue);
		System.out.println("Static Value   : " + staticValue);
	}
}