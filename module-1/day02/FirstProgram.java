public class FirstProgram {

	void main(String [] a) {
		// Create a dog object
		Dog aungNet = new Dog();

		// Assign States
		aungNet.name = "Aung Net";
		aungNet.color = "Black";

		aungNet.greet();

		Dog ngaNi = new Dog();
		ngaNi.name = "Nga Ni";
		ngaNi.color = "Red";

		ngaNi.greet();
	}

}