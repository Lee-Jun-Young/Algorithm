package programmers;

import java.util.PriorityQueue;

public class _42626 {

	public static void main(String[] args) {
		int[] scoville = { 1, 2, 3, 9, 10, 12 };
		int K = 7;

		System.out.println(solution(scoville, K));

	}

	public static int solution(int[] scoville, int K) {

		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

		for (int i : scoville) {
			queue.add(i);
		}

		int cnt = 0;
		while (queue.peek() <= K) {
			if (queue.size() == 1)
				return -1;

			queue.add(queue.poll() + (queue.poll() * 2));
			cnt++;
		}

		return cnt;

	}
}
