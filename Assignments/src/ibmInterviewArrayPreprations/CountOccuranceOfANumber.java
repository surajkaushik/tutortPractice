package ibmInterviewArrayPreprations;

public class CountOccuranceOfANumber {

	public static void main(String[] args) {
		int count=0;
		int arr[] = {1, 1, 2, 2, 2,1,1,1,1,1,1,1,1, 2, 3},   x = 1;
		for (int i : arr) {
			if(i==x) {count++;
			}
		}
		System.out.println(count);

	}

}
