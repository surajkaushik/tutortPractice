package ibmInterviewArrayPreprations;

public class PeakElement {
//	Input: array[] = {10, 20, 15, 2, 23, 90, 67}
//	Output: 20 or 90
//	Explanation: The element 20 has neighbors 10 and 15, 
//	both of them are less than 20, similarly 90 has neighbors 23 and 67.
//	The following corner cases give a better idea about the problem. 
//
//	If the input array is sorted in a strictly increasing order, 
//	the last element is always a peak element. For example, 50 is peak element in {10, 20, 30, 40, 50}.
//	
//	If the input array is sorted in a strictly decreasing order,
//	the first element is always a peak element. 100 is the peak element in {100, 80, 60, 50, 20}.
//	
//	If all elements of the input array are the same, every element is a peak element.

	public static void main(String[] args) {
		int array[] = { 10, 20, 15, 2, 23, 90, 67,211};
		int len=array.length;
		if (len == 1) {
			System.out.println(array[0]);
		}
		if (array[0] >= array[1]) {
			System.out.println(array[0]);
		}
		if(array[len-1]>array[len-2]) {
			System.out.println(array[len-1]);
		}
		for (int i = 1; i < len-1; i++) {
			if(array[i]>=array[i+1] && array[i]>=array[i-1]) {
				System.out.println(array[i]);
			}
			else {
				continue;
			}
		}

	}

}
