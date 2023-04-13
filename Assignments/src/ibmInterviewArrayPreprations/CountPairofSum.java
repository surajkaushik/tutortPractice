package ibmInterviewArrayPreprations;

public class CountPairofSum {

	public static void main(String[] args) {
		int count = 0;
		int arr[] = { -5, 1, 2, -1 }, sum = 6;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == sum) {
					count++;
					System.out.println(arr[i] + " " + arr[j]);
				}
			}
		}
		if (count == 0) {
			System.out.println("No");
		} else {
			System.out.println(count);
		}
	}
}
