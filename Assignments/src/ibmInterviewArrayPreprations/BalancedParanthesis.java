package ibmInterviewArrayPreprations;

import java.util.Stack;

public class BalancedParanthesis {

	public static void main(String[] args) {
		String str = "()(())";
		if (balancedParenthesis(str))
			System.out.println("True");
		else
			System.out.println("False");
	}

	private static boolean balancedParenthesis(String str) {
		Stack s = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			char x = str.charAt(i);
			if (x == '(' || x == '[' || x == '{') {
				s.push(x);
				continue;
			}
			System.out.println(s);
			if (x == ')' || x == ']' || x == '}') {
				return false;
			}

		}
		return false;

	}

}
