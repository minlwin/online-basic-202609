public class BreakWithLabel {

	private static String [][] subjects = {
		new String[]{"Language Fundamentals", "OOP", "Essential APIs"},
		new String[]{"HTML", "CSS", "JS", "Servlet", "JSP", "JSTL"},
		new String[]{"Spring Core", "Spring Data", "Spring MVC", "Spring Boots"},
		new String[]{"Components", "Commons Hooks", "Next JS", "Fetch API", "Exception Handling"},
	};

	public static void find(String target) {
		outer :
		for(var i = 0; i < subjects.length; i ++) {
			
			var array = subjects[i];
			System.out.println("Reach Outer Loop " + i);
			
			for(var j = 0; j < array.length; j ++) {
				System.out.println("Reach Inner Loop " + j);
				var subject = array[j];

				if(subject.equals(target)) {
					System.out.println("subject is found");
					System.out.println("Outer Index is " + i);
					System.out.println("Inner Index is " + j);
					break outer;
				}
			}
		}
	}
}