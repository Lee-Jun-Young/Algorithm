package programmers;

import java.util.Arrays;

public class _81301 {

	public static void main(String[] args) {
		String s = "one4seveneight";

		System.out.println(solution(s));

	}

	public static int solution(String s) {
		int answer = 0;

		while (!isNumber(s)) {
			if (s.contains("one"))
				s = s.replaceAll("one", "1");
			else if (s.contains("two"))
				s = s.replaceAll("two", "2");
			else if (s.contains("three"))
				s = s.replaceAll("three", "3");
			else if (s.contains("four"))
				s = s.replaceAll("four", "4");
			else if (s.contains("five"))
				s = s.replaceAll("five", "5");
			else if (s.contains("six"))
				s = s.replaceAll("six", "6");
			else if (s.contains("seven"))
				s = s.replaceAll("seven", "7");
			else if (s.contains("eight"))
				s = s.replaceAll("eight", "8");
			else if (s.contains("nine"))
				s = s.replaceAll("nine", "9");
			else
				s = s.replaceAll("zero", "0");

		}

		answer = Integer.parseInt(s);

		return answer;
	}

	public static boolean isNumber(String s) {
		try {
			Double.parseDouble(s);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

}
