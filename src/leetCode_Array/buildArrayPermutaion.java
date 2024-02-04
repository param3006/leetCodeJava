package leetCode_Array;

public class buildArrayPermutaion {
	
	public static void main(String[] args) {
		int array[] = {5,0,1,2,3,4};
		for (int i = 0; i <= array.length - 1; i++) {
			System.out.print(array[i]);

		}
		System.out.println(" ");
		for (int j = 0; j <= array.length - 1; j++) {
			System.out.print(array[array[j]]);
		}
	}
}