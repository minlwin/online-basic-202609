public class LegacyFor {

	// If count is 3
	public static void loop1(int count) {

		// i == 0, 0 < 3, print 0 / 3
		// i == 1, 1 < 3, print 1 / 3
		// i == 2, 2 < 3, print 2 / 3
		// i == 3, 3 < 3 -> out of loop

		for(int i = 0; i < count; i ++) {
			System.out.println("%d / %d".formatted(i, count));
		}
	}

	public static void loop2(int count) {
		for(int i = count; i > 0; i --) {
			System.out.println("%d / %d".formatted(i, count));
		}
	}	

	public static void loop3(int count) {
		for(int i = 0; i <= count; i += 2) {
			System.out.println("%d / %d".formatted(i, count));
		}
	}	

}