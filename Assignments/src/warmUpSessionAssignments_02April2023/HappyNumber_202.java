package warmUpSessionAssignments_02April2023;

public class HappyNumber_202 {
	public static void main(String[] args) {
		int n = 701;
		if (HappyNumber_202.happyNumber(n)) {
			System.out.println("Happy Number");
		} else {
			System.out.println("Not Happy");
		}
	}

	public static Boolean happyNumber(int n) {
		int newValue = 0;
		if (n == 2 || n == 3 || n == 4 || n == 5 || n == 6|| n == 8 || n == 9) {
			return false;
		} else {
			while (n > 0) {
				int r = n % 10;
				newValue += r * r;
				n /= 10;
			}
			if (newValue == 1||newValue == 7) {
				return true;
			} else {
				return happyNumber(newValue);
			}
		}

	}
}
