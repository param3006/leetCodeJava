package leetCode_Array;

public class shuffleArray {

	public static void main(String[] args) {
		for(int value:shuffle(new int[] {2,5,1,3,4,7}, 3)) {
			System.out.print(value);
		}
	}

	public static int[] shuffle(int[] nums, int n) {
		int[] arr=new int[n*2];
		for(int i=0;i<n;i++) {
			arr[i*2]=nums[i];
			arr[(2*i)+1]=nums[i+n];
		}
		return arr;
	}

}
