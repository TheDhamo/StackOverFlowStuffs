package misc;

public class problemSolving {
	public static void main(String[] args) {
		String input = "aaacccbbd";
//		String output = "a3b2c3d1";
		
		String result = null;
		int iCounter;
		String alpha = "abcde";
		char[] letters = "aaacccbbd".toCharArray();
		char[] alphaphts = alpha.toCharArray();

		for (char a : alphaphts) {
			iCounter = 0;
			for (char c : letters) {
				if (a == c) {
					iCounter++;
				}
			}

			result = result + a + iCounter;

		}
		
		System.out.println(result.replaceAll("null", ""));
	}
}
