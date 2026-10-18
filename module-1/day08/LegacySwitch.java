public class LegacySwitch {

	public enum Status {
		Applied, Pending, Rejected, Approved
	}

	public static void showCurrentCondition(Status status) {
		switch(status) {
		case Pending:
			System.out.println("Application is pending, please check it.");
			break;
		case Rejected:
			System.out.println("Application is rejected. Please check your information.");
			break;
		case Approved:
			System.out.println("Application is approved. You can use wallet feature.");
			break;
		default:
			System.out.println("This is default status");
			break;
		}
	}

	public static void withLambdaStyle(Status status) {
		switch(status) {
		case Pending -> System.out.println("Application is pending, please check it.");
		case Rejected -> System.out.println("Application is rejected. Please check your information.");
		case Approved -> System.out.println("Application is approved. You can use wallet feature.");
		default -> System.out.println("This is default status");
		}
	}

}