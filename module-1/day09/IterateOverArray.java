public  class IterateOverArray {

	public static void showWithLegacy(String [] array) {
		for(var i = 0; i < array.length; i ++) {
			
			var no = i + 1;
			var element = array[i];

			System.out.println("%d : %s".formatted(no, element));
		}
	}

	public static void showWithEnhance(String [] array) {
		for(var element : array) {
			System.out.println(element);
		}
	}

}