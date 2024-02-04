package leetCode_Array;

public class leftRight {

	public static void main(String[] args) {
		for (int i : leftRightDifference(new int[] { 1 })) {
			System.out.println(i);
		}
	}

	public static int[] leftRightDifference(int[] nums) {

		int[] ans = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {

			int leftSum = 0;
			int rightSum = 0;

			for (int j = 0; j < i; j++) {
				leftSum = leftSum + nums[j];
			}

			for (int k = nums.length - 1; k > i; k--) {
				rightSum = rightSum + nums[k];
			}

			ans[i] = Math.abs(leftSum - rightSum);

		}

		return ans;

	}

}
