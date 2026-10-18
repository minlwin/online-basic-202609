import java.util.Scanner;

public class WhileDemo {

	public static void main(String[] args) {
		var scanner = new Scanner(System.in);

		var doAgain = true;

		while(doAgain) {
			System.out.println("Start Calculation ...");
			
			// Get Digit 1
			System.out.print("Enter Digit 1 : ");
			var str1 = scanner.nextLine();
			var digit1 = Integer.parseInt(str1);

			// Get Digit 2
			System.out.print("Enter Digit 2 : ");
			var str2 = scanner.nextLine();
			var digit2 = Integer.parseInt(str2);

			// Show result of digit 1 + digit 2
			var result = digit1 + digit2;
			System.out.println("%d + %d = %d".formatted(digit1, digit2, result));
			System.out.println();

			// Ask user to do again
			System.out.print("Do you want to do again ? (Y/Others) : ");
			var decision = scanner.nextLine();

			doAgain = "Y".equals(decision);
		}
	
	}
}