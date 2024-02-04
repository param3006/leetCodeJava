package leetCode_Array;

public class goodPair {

	public static void main(String[] args) {
		int[] arr= {1,1,1,1};
		System.out.println(pair(arr));

	}
	
	public static int pair(int[] nums) {
		
		int[] arr=new int[101];
		

        for(int i=0;i<nums.length;i++)
        {
            arr[nums[i]]++;
            
        }

        int count=0;

        for(int i=1;i<101;i++)
        {
            int ele=(arr[i]*(arr[i]-1))/2;
            System.out.println(ele);
            count+=(ele);
        }
        return count;
	}
}
