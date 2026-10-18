public  class ContinueDemo {

	private static String [] array = {
		"Java", "JavaScript", "TypeScript", "Kotlin", 
		"Python", "C", "C++", "Visual Basic"
	};

	public static void showWithinLength(int length) {
		for(var i = 0; i < array.length; i ++) {
			var lanauage = array[i];

			if(lanauage.length() > length) {
				continue;
			}

			System.out.println("Index Number is " + i);
			System.out.println("Language is " + lanauage);
		}
	}
}