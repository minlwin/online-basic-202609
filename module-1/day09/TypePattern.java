public class TypePattern {

	public static String getType(Object value) {
		return switch(value) {
		case null -> "Value is null";
		case Integer i when i < 0 -> "Value is Negative Integer";
		case Integer _ -> "Value is Positive Integer";
		case String str when str.isEmpty() -> "Value is empty string";
		case String _ -> "Value is string";
		default -> "Other types";
		};
	}
}