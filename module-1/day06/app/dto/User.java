package app.dto;

public class User {
	String name;

	public User(String name) {
		this.name = name;
	}

	public void greet() {
		System.out.println("Hello! I am " + name);
	}
}
