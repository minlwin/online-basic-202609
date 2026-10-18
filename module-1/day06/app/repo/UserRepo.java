package app.repo;

import app.dto.User;

public class UserRepo {

	User [] users = new User[0];

	public void addUser(User user) {
		// Local variable type inferance
		// Create new Array with +1 length of original array
		var newArray = new User[users.length + 1];

		// Copy elements from users to newArray
		for (var index = 0; index < users.length; index ++) {
			newArray[index] = users[index];
		}

		// Set user to last index of newArray
		newArray[newArray.length - 1] = user;

		// assign user with new array
		users = newArray;
	}

	public void greetAll() {
		for (var index = 0; index < users.length; index ++) {
			var user = users[index];
			user.greet();
		}
	}
}