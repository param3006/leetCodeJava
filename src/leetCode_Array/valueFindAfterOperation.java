package leetCode_Array;

public class valueFindAfterOperation {

	public static void main(String[] args) {
		String[] operations = {"X++","++X","--X","X--"};
		System.out.println(operation(operations));

	}

	public static int operation(String[] operationsArr) {
		int value = 0;

		for (String operation : operationsArr) {
			if (operation.contains("++")) {
				value += 1;
			} else if (operation.contains("--")) {
				value -= 1;
			}else {
				System.out.println("Operation Not Defined"+operation);
				continue;
			}
		}
		return value;
	}

}
