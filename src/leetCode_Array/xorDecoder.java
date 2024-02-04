package leetCode_Array;

public class xorDecoder {

	public static void main(String[] args) {
		for (int i : decode(new int[] { 6,2,7,3 }, 4)) {
			System.out.println(i);
		}
	}

	public static int[] decode(int[] encoded, int first) {
		int[] ans = new int[encoded.length + 1];

		ans[0] = first;

		for (int i = 0; i < encoded.length; i++) {
				ans[i+1]=encoded[i]^ans[i];
			
		}

		return ans;
	}

}
