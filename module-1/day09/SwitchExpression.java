public class SwitchExpression {

	public enum Weather {
		Sunny, Rainy, Cloudy
	}

	public static String beforeExpression(Weather weather) {
		String result = null;

		switch(weather) {
		case Sunny:
		case Rainy:
			result = "Unbrella";
			break;	
		case Cloudy:
			result = "Hat";
			break;	
		}

		return result;
	}

	public static String afterExpression(Weather weather) {
		return switch(weather) {
		case Sunny:
		case Rainy:
			yield "Umbrella";
		case Cloudy:
			yield "Hat";	
		};
	}

	public static String newStyleLabel(Weather weather) {
		return switch(weather) {
		case Sunny, Rainy -> {
			System.out.println("Weather is " + weather);
			yield "Umbrella";
		}
		case Cloudy -> "Hat";
		};
	}
}