package ibmInterviewArrayPreprations;

public class Rearrage_veNumbers {

	public static void main(String[] args) {
		int arr[] = { -1, 2, -3, 4};
		int n = arr.length,temp=0;
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i + 1; j < arr.length; j++) {
				
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println();
			for (int ii : arr) {
				System.out.print(ii+" ");
			}
			
		}
//		for (int i : arr) {
//			System.out.print(i+" ");
//		}
	}

}
