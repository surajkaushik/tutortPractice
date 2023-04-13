package ibmInterviewArrayPreprations;

public class SumOfSubArray {

	public static void main(String[] args) {
		int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 }, CheckSum = 23;

		for (int i = 0; i < arr.length; i++) {

			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum += arr[j];
				// System.out.print(sum+" ");
				if (sum == CheckSum) {
					System.out.println("Found between " + i + " and " + j);
					// System.out.println();
					for (int a = i; a <= j; a++) {
						System.out.print(arr[a] + " ");

					}
					System.out.println();
					break;
				}

			}

		}

	}

}
