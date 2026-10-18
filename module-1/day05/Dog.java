public class Dog {

	String name;
	String color;
	int id;

	static int idCounter;


	// Init Blocks
	// Instance Block
	// Can Initialize instance variables
	// Before calling constructor to create an Object
	{
		System.out.println("Instance Block");
		idCounter ++;
	}

	// Static Block
	// Can Initialize Static Variables
	// After loading class on JVM Memory
	static {
		// read file
		// parse value to integer
		// Assign to Static Variables
		System.out.println("Static Block");
	}

	// Constructors
	public Dog() {
		id = idCounter;
	}

	public Dog(String name) {
		id = idCounter;
		this.name = name;
	}

	public Dog(String color) {
		id = idCounter;
		this.color = color;
	}

	public Dog(String name, String color) {
		id = idCounter;
		this.name = name;
		this.color = color;
		System.out.println("Constructor");
	}

	void greet() {
		System.out.println("Hello! I am " + name);

		{

		}
	}
}