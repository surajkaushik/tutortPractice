package ibmInterviewArrayPreprations;

public class SortArray {
	public static void main(String[] args) {
		int arr[] = { 0, 23, 14, 12, 9 };
		sortArray(arr);
	}

	private static void sortArray(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
//					temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
					
					arr[i] = arr[i]+ arr[j];
					arr[j] = arr[i]- arr[j];
					arr[i] = arr[i]- arr[j];
				}
			}
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}
}
