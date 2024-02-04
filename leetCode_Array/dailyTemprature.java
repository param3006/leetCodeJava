package leetCode_Array;

public class dailyTemprature {

	public static void main(String[] args) {
		for (int i : warmerTemp(new int[] { 89, 62, 70, 58, 47, 47, 46, 76, 100, 70 })) {
			System.out.print(i);
		}

	}

	public static int[] warmerTemp(int[] nums) {
		int[] ans = new int[nums.length];

		for (int i = 0; i < nums.length - 1; i++) {
			int count = 0;
			for (int j = i; j < nums.length - 1; j++) {
				if (nums[i] < nums[j + 1]) {
					ans[i] = ++count;
					break;
				} else {
					count++;
				}
			}
		
		}
		return ans;
	}


}
