package leetCode_Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class pairsCounting {

	public static void main(String[] args) {
		Integer[] list= {-6,2,5,-2,-7,-1,3};
		List<Integer> nums=new ArrayList<Integer>();
		nums.addAll(Arrays.asList(list));
		System.out.println(countPairs(nums, -2));
	}

	public static int countPairs(List<Integer> nums, int target) {
		int count = 0;
		for (int i = 0; i < nums.size(); i++) {
			for (int j = i+1; j < nums.size(); j++) {
				if (nums.get(i) + nums.get(j) < target) {
					count++;
				}
			}
		}
		return count;
	}
	
	
// 	Solved by leetcode users	
//	 public int countPairs(List<Integer> nums, int target) {
//	        int n = nums.size();
//	        int count = 0;
//
//	        for (int i = 0; i < n - 1; i++) {
//	            for (int j = i + 1; j < n; j++) {
//	                if (nums.get(i) + nums.get(j) < target) {
//	                    count++;
//	                }
//	            }
//	        }
//	        return count;
//	    }

}
