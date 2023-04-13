package ibmInterviewArrayPreprations;

public class BotonicPoint {

	public static void main(String[] args) {
		int n = 9;
		int arr[] = { 1, 15, 25, 45, 42, 21, 17, 12, 11 };
		botonicPoint(arr, n);
	}

	private static void botonicPoint(int[] arr, int n) {
		int max=arr[0];
		if (n == 1) {
			System.out.println(arr[0]);
		}
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] > max) {
				max=arr[i];
				
			} 
		}System.out.println(max);

	}
}