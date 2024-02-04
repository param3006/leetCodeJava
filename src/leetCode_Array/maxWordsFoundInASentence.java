package leetCode_Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class maxWordsFoundInASentence {

	public static void main(String[] args) {
		System.out.println(mostWordsFound(new String[] { "w jrpihe zsyqn l dxchifbxlasaehj",
				"nmmfrwyl jscqyxk a xfibiooix xolyqfdspkliyejsnksfewbjom",
				"xnleojowaxwpyogyrayfgyuzhgtdzrsyococuqexggigtberizdzlyrdsfvryiynhg",
				"krpwiazoulcixkkeyogizvicdkbrsiiuhizhkxdpssynfzuigvcbovm",
				"rgmz rgztiup wqnvbucfqcyjivvoeedyxvjsmtqwpqpxmzdupfyfeewxegrlbjtsjkusyektigr",
				"o lgsbechr lqcgfiat pkqdutzrq iveyv iqzgvyddyoqqmqerbmkxlbtmdtkinlk",
				"hrvh efqvjilibdqxjlpmanmogiossjyxepotezo", "qstd zui nbbohtuk",
				"qsdrerdzjvhxjqchvuewevyzlkyydpeeblpc" }));
	}

	public static int mostWordsFound(String[] sentences) {
		Map<Integer, Integer> test = new HashMap<Integer, Integer>();

		for (int i = 0; i < sentences.length; i++) {

			String[] words = sentences[i].split(" ");

			test.put(i, words.length);

		}
		return Collections.max(test.values());

	}
	
	//My Optimised Approach
	
	/*
	 * public static int mostwordsFound(String[] sentences) { int[] test = new
	 * int[sentences.length]; int count = 0;
	 * 
	 * for (int i = 0; i < sentences.length; i++) {
	 * 
	 * String[] words = sentences[i].split(" "); test[i] = words.length; }
	 * 
	 * Arrays.sort(test);
	 * 
	 * count = test[test.length - 1]; return count; }
	 */
	
	
	//Optimised Approach
	/*
	 * public static int mostWordsFound(String[] sentences) { int count = 0; for
	 * (int i=0;i<sentences.length;i++) { String[] words = sentences[i].split(" ");
	 * if(count>words.length) { count=words.length; } } return count; }
	 */

}
