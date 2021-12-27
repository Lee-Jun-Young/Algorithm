package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class _42586 {

	public static void main(String[] args) {

		int[] progresses = { 20, 99, 93, 30, 55, 10 };
		int[] speeds = { 5, 10, 1, 1, 30, 5 };

		System.out.println(Arrays.toString(solution(progresses, speeds)));
	}

	public static int[] solution(int[] progresses, int[] speeds) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		double cnt = 0;
		for (int i = 0; i < progresses.length; i++) {
			double temp = Math.ceil((100 - progresses[i]) / (double) speeds[i]);
			if (cnt < temp) {
				cnt = temp;
				list.add(1);
			} else {
				list.set(list.size() - 1, list.get(list.size() - 1) + 1);
			}
		}

		int[] answer = new int[list.size()];
		int idx = 0;
		for (int i : list) {
			answer[idx++] = i;
		}

		return answer;
	}

}
