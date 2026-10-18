public class References {

	public static void main(String[] args) {
        User user = new User();
        user.name = "Min Lwin";
        user.greet();
	}
}

class User {
	String name;

	void greet() {
		System.out.println("Hello, my name is " + name);
	}
}