package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class _42840 {

	public static void main(String[] args) {
		int[] answers = { 1, 3, 2, 4, 2 };

		System.out.println(Arrays.toString(solution(answers)));

	}

	public static int[] solution(int[] answers) {
		int[] answer = {};
		int[] num1 = { 1, 2, 3, 4, 5 };
		int[] num2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] num3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

		int num1_result = 0;
		int num2_result = 0;
		int num3_result = 0;

		for (int i = 0; i < answers.length; i++) {
			int temp = answers[i];

			if (temp == num1[i % 5])
				num1_result++;
			if (temp == num2[i % 8])
				num2_result++;
			if (temp == num3[i % 10])
				num3_result++;
		}

		ArrayList<Integer> list = new ArrayList<Integer>();

		int max = Math.max(Math.max(num1_result, num2_result), num3_result);

		if (max == num1_result)
			list.add(1);
		if (max == num2_result)
			list.add(2);
		if (max == num3_result)
			list.add(3);

		answer = new int[list.size()];

		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}

		return answer;
	}
}
