package warmUpSessionAssignments_02April2023;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseVowel_345 {
	public static void main(String[] args) {
		String s = "leetcode";
		ReverseVowel_345.reverseVowels(s);
	}

	private static void reverseVowels(String s) {
		char c[] = new char[s.length()];
		List<Character> vowels = new ArrayList<>();
		List<Integer> indexOfVowels = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			c[i] = s.charAt(i);
			if (c[i] == 'a' || c[i] == 'A' || c[i] == 'e' || c[i] == 'E' || c[i] == 'i' || c[i] == 'I' || c[i] == 'o'
					|| c[i] == 'O' || c[i] == 'u' || c[i] == 'U') {
				vowels.add(c[i]);
				indexOfVowels.add(i);
			}
		}
		Collections.reverse(vowels);
		for (int x = 0; x < indexOfVowels.size(); x++) {
			c[indexOfVowels.get(x)] = vowels.get(x);
		}
		String reversedVowelString= String.valueOf(c);
		System.out.println(reversedVowelString);
	}
}
