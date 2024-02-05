package leetCode_Array;


public class uniqueChar {

	public static void main(String[] args) {
		System.out.println(uniqchar("leetcode"));

	}

	public static int uniqchar(String s) {
		
		
		for (char c : s.toLowerCase().toCharArray()) {

			if (s.indexOf(c) == s.lastIndexOf(c)) {
				return s.indexOf(c);
			}
		}
		return -1;

	}

}
