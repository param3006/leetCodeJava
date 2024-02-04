package leetCode_Array;

public class concatArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5 };
		concatArr(arr);
	}

	public static int[] concatArr(int[] arr) {

		// Original arrays
		int[] newArr = new int[2 * arr.length];

		for (int i = 0; i <arr.length; i++) {
			newArr[i]=arr[i];
			newArr[i + arr.length]=arr[i];
		}
		
		for(int j=0;j<newArr.length;j++) {
			System.out.print(newArr[j]);
		}
		return newArr;

	}
}
