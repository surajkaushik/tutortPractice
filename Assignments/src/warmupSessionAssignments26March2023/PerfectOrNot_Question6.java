package warmupSessionAssignments26March2023;

public class PerfectOrNot_Question6 {

	public static void main(String[] args) {
		int Arr[] = { 1, 2, 3, 2, 1 };
		PerfectOrNot_Question6.perfectOrNot(Arr);
	}

	static void perfectOrNot(int arr[]) {
		int count = 0;
		int revArr[] = new int[arr.length];
		for (int i = arr.length - 1; i >= 0; i--) {
			revArr[arr.length - 1 - i] = arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == revArr[i]) {
				count++;
			} else {
				System.out.println("Not PERFECT");
				break;
			}
		}
		if (count == arr.length) {
			System.out.println("PERFECT");
		}
	}
}
