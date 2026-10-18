import java.util.Scanner;

public class ForAsEndlessLoop {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		for(;;) {
			System.out.println("Start Calculation ...");
			
			var digit1 = readInt("Enter Digit 1 : ");
			var digit2 = readInt("Enter Digit 2 : ");

			// Show result of digit 1 + digit 2
			var result = digit1 + digit2;

			System.out.println("%d + %d = %d".formatted(digit1, digit2, result));
			System.out.println();

			if(!askToDoAgain()) {
				break;
			}
		} 
	}

	private static int readInt(String message) {
		System.out.print(message);
		var str = scanner.nextLine();
		return Integer.parseInt(str);
	}

	private static boolean askToDoAgain() {
		// Ask user to do again
		System.out.print("Do you want to do again ? (Y/Others) : ");
		var decision = scanner.nextLine();

		return "Y".equals(decision);
	}		
}