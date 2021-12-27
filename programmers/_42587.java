package programmers;

import java.util.Collections;
import java.util.PriorityQueue;

public class _42587 {

	public static void main(String[] args) {

		int[] priorities = { 2, 1, 3, 2 };
		int location = 2;

		System.out.println(solution(priorities, location));
	}

	public static int solution(int[] priorities, int location) {
		int answer = 1;

		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());

		for (int i : priorities) {
			queue.add(i);
		}

		while (!queue.isEmpty()) {
			for (int i = 0; i < priorities.length; i++) {
				if (priorities[i] == queue.peek()) {
					if (i == location) {
						return answer;
					}
					queue.poll();
					answer++;
				}
			}
		}

		return answer;
	}

}
