package leetCode_Array;

import java.util.ArrayList;
import java.util.List;

public class greatestCandies {

	public static void main(String[] args) {
		System.out.println(kidsWithCandies(new int[] { 2, 3, 5, 1, 3 }, 3));
	}

	public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		List<Boolean> isHavingCandy = new ArrayList<Boolean>();
		int max=candies[0];

		for(int j=1;j<candies.length;j++) {
			if(candies[j]>max) {
				max=candies[j];
			}
		}
		
		for (int i = 0; i < candies.length; i++) {
			int totalCandies = extraCandies + candies[i];
			isHavingCandy.add(totalCandies>=max);
		}

		return isHavingCandy;

	}

}
