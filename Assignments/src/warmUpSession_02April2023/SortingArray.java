package warmUpSession_02April2023;

public class SortingArray {

	public static void main(String[] args) {
		int a[] = { 213, 32, 54, 65, 12, 7, -1, 0, 324, 23 };
		int temp = 0;
		int start=0,end=a.length-1;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		for (int i : a) {
			System.out.print(i + " ");
		}

	}

}
