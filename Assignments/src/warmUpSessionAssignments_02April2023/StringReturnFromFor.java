package warmUpSessionAssignments_02April2023;

import java.util.ArrayList;
import java.util.List;

public class StringReturnFromFor {

	public static void main(String[] args) {
		List<String> s = List.of("suraj", "shreyansh", "yuvraj", "kartik", "suraj", "shreyansh");
		System.out.println(s);
		System.out.println(StringReturnFromFor.print(s));

	}

	private static String print(List<String> s) {
		for (int i = 0; i < s.size(); i++) {
			if(s.get(i).equals("suraj")||s.get(i).equals("yuvraj")) {
				return s.get(i);
			}
		
		}
		return null;
	}

}
