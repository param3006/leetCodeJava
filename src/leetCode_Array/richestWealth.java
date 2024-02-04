package leetCode_Array;

public class richestWealth {

	public static void main(String[] args) {
		System.out.print(maximumWealth(new int[][] { { 1, 5 }, { 7, 3 }, { 3, 5 } }));

	}

	public static int maximumWealth(int[][] accounts) {
		int ans = Integer.MIN_VALUE;
		for (int i = 0; i < accounts.length; i++) {
			int rowSum = 0;
			for (int j = 0; j < accounts[i].length; j++) {

				rowSum += accounts[i][j];

			}
			if (rowSum > ans) {
				ans = rowSum;

			}

		}
		return ans;
	}
}
