package leetCode_Array;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class windowSubString {

	public static void main(String[] args) {
		System.out.println(minWindow("ADOBECODEBANC", "ABC"));
	}

	public static String minWindow(String s, String t) {
		int currentMin = 0;

		List<String> subStrVals = new ArrayList<String>();
		for (int i = 0; i < s.length(); i++) {

			for (int j = i; j <= s.length(); j++) {

				String subStr = s.substring(i, j);
				subStrVals.add(subStr);

			}

		}
		
		for(String str:subStrVals) {
			char[] ch=t.toCharArray();
			
			for(int k=0;k<ch.length;k++) {
				
				
				
			}
		}

		return null;

	}

	Boolean isPresent(String str) {

		for (char c : str.toCharArray()) {

			if (str.contains(String.valueOf(c))) {
				return true;
			}
		}
		return null;

	}

}
