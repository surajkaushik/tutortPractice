package warmUpSessionAssignments_01April2023;

public class Question1_ReverseANumber {

	public static void main(String[] args) {
		int num = 132;
		System.out.println(Question1_ReverseANumber.reverseANumber(num));
	}

	private static int reverseANumber(int num) {
		int revNum = 0;
		if (num < 0) {
			while (num < 0) {
				int r = num % 10;
				revNum = revNum * 10 + r;
				num /= 10;
			}
			return revNum;
		} else {
			while (num > 0) {
				int r = num % 10;
				revNum = revNum * 10 + r;
				num /= 10;
			}
			return revNum;
		}
	}
}
