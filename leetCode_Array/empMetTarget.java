package leetCode_Array;

public class empMetTarget {

	public static void main(String[] args) {
		System.out.println(numberOfEmployeesWhoMetTarget(new int[] {0,1,2,3,4}, 2));
	}
	
	public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
		int count=0;
		for(int hour:hours) {
			if(hour>=target) {
				count++;
			}
		}
	    return count;
	}

}
