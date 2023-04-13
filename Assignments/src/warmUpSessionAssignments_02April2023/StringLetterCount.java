package warmUpSessionAssignments_02April2023;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class StringLetterCount {

	public static void main(String[] args) {
		String s = "surajkaushik";

		char ch[] = s.toCharArray();
		
		Map<String, Integer> m = new TreeMap<>();
		for (char c : ch) {
			if(m.containsKey(String.valueOf(c))) {
				m.put(String.valueOf(c), m.get(String.valueOf(c))+1);
			}
			else {
				m.put(String.valueOf(c), 1);
			}
		}
		System.out.println(m);
	}

}
