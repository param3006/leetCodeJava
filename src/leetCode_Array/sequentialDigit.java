package leetCode_Array;

import java.util.ArrayList;
import java.util.List;

public class sequentialDigit {

	public static void main(String[] args) {
		System.out.println(sequentialDigits(100, 300));
	}

	public static List<Integer> sequentialDigits(int low, int high) {
		List<Integer> digit = new ArrayList<Integer>();
		int num=low;
		int sum=0;
		int rem;
		while(num!=0) {
			num=num/low;
			sum=sum*10+num;
			rem=
					
					
					
					
			low++;
		}
		return digit;

	}
}
