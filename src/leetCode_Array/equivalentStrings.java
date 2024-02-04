package leetCode_Array;

import java.util.ArrayList;
import java.util.List;

public class equivalentStrings {

	public static void main(String[] args) {
		System.out.println(arrayStringsAreEqual(new String[] { "abc", "d", "defg" }, new String[] { "abcddefg" }));
	}

	/*
	 * public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
	 * 
	 * String[] temp1 = new String[word1.length]; String[] temp2 = new
	 * String[word2.length];
	 * 
	 * List<String> list = new ArrayList<String>(); temp1[0] = word1[0]; for (int i
	 * = 1; i <= word1.length-1; i++) {
	 * 
	 * 
	 * temp1[i] = word1[i]; temp1[i] = temp1[i - 1].concat(word1[i]);
	 * 
	 * if (i == word1.length - 1) { list.add(temp1[i]); }
	 * 
	 * }
	 * 
	 * if(word1.length==1) { list.add(word1[0]); }
	 * 
	 * temp2[0] = word2[0]; for (int j = 1; j <= word2.length-1; j++) { temp2[j] =
	 * word2[j]; temp2[j] = temp2[j - 1].concat(word2[j]);
	 * 
	 * if (j == word2.length - 1) { list.add(temp2[j]); } }
	 * 
	 * if(word2.length==1) { list.add(word2[0]); }
	 * 
	 * if(list.get(0).equals(list.get(1))){ return true; }
	 * 
	 * return false;
	 * 
	 * }
	 */

	// Optimistic solution - Space complexity

	public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
		// Creates a new string by combining all the strings in word1.
		StringBuffer word1Combined = new StringBuffer();
		for (String s : word1) {
			word1Combined.append(s);
		} 
		
		// Creates a new string by combining all thestrings in word2.
		StringBuffer word2Combined = new StringBuffer();
		for (String s : word2) {
			word2Combined.append(s);
		}
		
		// Returns true if bothstring are the same.
		return word1Combined.compareTo(word2Combined) == 0;
	}

}
