package leetCode_Array;

public class smallerNumber {

	public static void main(String[] args) {
		for (int val : smallerNumbersThanCurrent(new int[] { 7, 7, 7, 7 })) {
			System.out.print(val);
		}
	}

	public static int[] smallerNumbersThanCurrent(int[] nums) {
		int[] ans = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			for (int j = 0; j < nums.length; j++) {
				if (nums[j] < nums[i]) {
					count++;
					ans[i] = count;
				}
			}
		}

		return ans;

	}

}
