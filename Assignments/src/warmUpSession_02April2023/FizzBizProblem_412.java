package warmUpSession_02April2023;

import java.util.ArrayList;
import java.util.List;

public class FizzBizProblem_412 {
	public static void main(String[] args) {
		int n = 30;
		FizzBizProblem_412.solution(n);
	}

	private static List<String> solution(int n) {
		List<String> arr = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			if ((i % 3 == 0) && (i % 5 == 0)) {
				arr.add("FizzBuzz");
			} else if ((i) % 3 == 0) {
				arr.add("Fizz");
			} else if ((i) % 5 == 0) {
				arr.add("Buzz");
			} else {
				arr.add(String.valueOf(i));
			}
		}
		for (String string : arr) {
			System.out.println(string);
		}
		return arr;

	}
}
