package leetCode_Array;


import java.util.Arrays;
import java.util.Collections;
public class minNumberGame {

	public static void main(String[] args) {
		for(int i:numberGame(new int[] { 5,4,2,3 })){
		
			System.out.println(i);
		}
	}

	/*
	 * public static int[] numberGame(int[] nums) {
	 * 
	 * int[] ans = new int[nums.length]; int round = 0; List<Integer> test1 = new
	 * ArrayList<Integer>(); int k=1; int m=0;
	 * 
	 * for (int num : nums) { test1.add(num); }
	 * 
	 * 
	 * 
	 * while (test1.size() != 0) { if (round % 2 == 0) { int aliceMin =
	 * Collections.min(test1); for (int i = 0; i < test1.size(); i++) { if
	 * (test1.get(i) == aliceMin) { test1.remove(i); break; } }
	 * 
	 * ans[k]=aliceMin; k=k+2; }
	 * 
	 * else{
	 * 
	 * int bobMin = Collections.min(test1); for (int i = 0; i < test1.size(); i++) {
	 * if (test1.get(i) == bobMin) { test1.remove(i); break; } }
	 * 
	 * ans[m]=bobMin; m=m+2; } round++; }
	 * 
	 * return ans; }
	 */
	
	
	//optimised code
	
	public static int[] numberGame(int[] nums){
		int[] ans= new int[nums.length];
		
		Arrays.sort(nums);
		
		for(int i=0;i<nums.length;i+=2){
			
			ans[i]=nums[i+1];
			ans[i+1]=nums[i];
		
		}
		
	
	return ans;
	}
	
	

}
