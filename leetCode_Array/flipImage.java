package leetCode_Array;

public class flipImage {

	public static void main(String[] args) {
		for (int[] array : flipAndInvertImage(new int[][] { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } })) {
			for (int test : array) {
				System.out.print(test);
			}
		}
	}
	
	
	//My written code
	/*
	 * public static int[][] flipAndInvertImage(int[][] image) {
	 * 
	 * 
	 * int[][] newImage = new int[image.length][image.length];
	 * 
	 * for (int i = 0; i < image.length; i++) {
	 * 
	 * int len = image[i].length - 1;
	 * 
	 * for (int j = 0; j < image[i].length; j++) {
	 * 
	 * newImage[i][len] = 1^image[i][j] ; len = len - 1;
	 * 
	 * }
	 * 
	 * } return newImage;
	 */

	// Optimised code
	public static int[][] flipAndInvertImage(int[][] A) {
		int C = A[0].length;
		for (int[] row : A)
			for (int i = 0; i < (C + 1) / 2; ++i) {
				int tmp = row[i] ^ 1;
				row[i] = row[C - 1 - i] ^ 1;
				row[C - 1 - i] = tmp;
			}
		return A;

	}
}