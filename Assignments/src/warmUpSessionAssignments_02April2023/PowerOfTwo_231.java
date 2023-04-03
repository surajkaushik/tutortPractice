package warmUpSessionAssignments_02April2023;

public class PowerOfTwo_231 {
	public static void main(String[] args) {
		int n = 99999999;
		System.out.println(PowerOfTwo_231.isPowerOfTwo(n));
	}

	public static boolean isPowerOfTwo(int n) {
		int pow = 0;
		for (int i = 1; i <= n; i++) {
			pow = (int) Math.pow(2, i);
			if (n == pow) {
				return true;
			}
		}
		return false;
	}
}
