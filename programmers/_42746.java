package programmers;

import java.util.Arrays;
import java.util.Comparator;

public class _42746 {

	public static void main(String[] args) {

		int[] numbers = { 3, 30, 34, 5, 9 };

		System.out.println(solution(numbers));
	}

	public static String solution(int[] numbers) {
		String answer = "";

		String[] arr = new String[numbers.length];

		for (int i = 0; i < numbers.length; i++) {
			arr[i] = String.valueOf(numbers[i]);
		}

		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return (o2 + o1).compareTo(o1 + o2);
			}
		});

		for (String str : arr) {
			answer += str;
		}

		if (answer.charAt(0) == '0')
			return "0";

		return answer;
	}

}
