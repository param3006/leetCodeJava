package leetCode_Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class binaryRep {

	public static void main(String[] args) {
		Integer[] num = { 4,3,2,1 };
		List<Integer> listOfNums = new ArrayList<Integer>(Arrays.asList(num));

		System.out.println(sumIndicesWithKSetBits(listOfNums, 2));
	}

	public static int sumIndicesWithKSetBits(List<Integer> nums, int k) {
		int sum = 0;
		for (int i = 0; i < nums.size(); i++) {
			int count = 0;
			String binaryNumber = Integer.toBinaryString(i);
			for (int j = 0; j < binaryNumber.length(); j++) {
				if (binaryNumber.charAt(j) == '1') {
					count++;
				}

			}
			if (count == k) {
				sum = sum + nums.get(i);
			}

		}
		return sum;

	}

}
