public class Conditional {

	public static boolean isEven(int data) {
		int modulus = data % 2;
		if(modulus == 0)
			return true;

		return false;
	}

	public static void howWeGo(boolean rainy) {
		if(rainy)
			System.out.println("Bring Umbrella");
		else
			System.out.println("Go without Umbrella");
	}

	public static void showGrade(int mark) {
		if(mark >= 0 && mark < 40) {
			System.out.println("Fails");	
		} else if (mark >= 40 && mark < 80) {
			System.out.println("Pass");
		} else if (mark >= 80 && mark <= 100) {
			System.out.println("Excellent");
		} else {
			System.out.println("Impossible");
		}
	}
}