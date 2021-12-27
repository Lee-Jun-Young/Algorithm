package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class _42586 {

	public static void main(String[] args) {

		int[] progresses = { 93, 30, 55 };
		int[] speeds = { 1, 30, 5 };

		System.out.println(Arrays.toString(solution(progresses, speeds)));
	}

	public static int[] solution(int[] progresses, int[] speeds) {
		int[] answer = new int[progresses.length];

		for (int i = 0; i < progresses.length; i++) {
			int temp = 100 - progresses[i];
			if (temp % speeds[i] == 0) {
				answer[i] = temp / speeds[i];
			} else {
				answer[i] = temp / speeds[i] + 1;
			}
		}

		ArrayList<Integer> list = new ArrayList<Integer>();

		int cnt = 0;
		for (int i = 0; i < answer.length; i++) {
			int current = answer[i];
			if (cnt < current) {
				cnt = current;
				list.add(1);
			} else {
				list.set(list.size() - 1, list.get(list.size() - 1) + 1);
			}
		}

		int[] result = new int[list.size()];
		int idx = 0;
		for (int i : list) {
			result[idx++] = i;
		}

		return result;
	}

}
