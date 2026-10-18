package app;

import app.dto.User;

public class MainApplication {
	
	public static void main(String[] args) {
		// Fully Qualified Name (package name + class name)
		User user = new User("Mike");
		user.greet();

		var repo = new app.repo.UserRepo();
		repo.addUser(user);

		repo.addUser(new User("Aung Aung"));
		repo.addUser(new User("Thidar"));

		repo.greetAll();

		var appUser = new app.User("Nilar");
		appUser.greet();
	}
}