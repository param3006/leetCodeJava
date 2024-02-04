package leetCode_Array;

public class runningSums {

	public static void main(String[] args) {
		for (int val : runningSum(new int[] { 1, 2, 3, 4 })) {
			System.out.println(val);
		}
	}

	public static int[] runningSum(int[] nums) {
		int[] ans = new int[nums.length];

		for (int i = 1; i < nums.length; i++) {

			ans[0] = nums[0];
			ans[i] = ans[i - 1] + nums[i];

		}

		return ans;

	}

}
