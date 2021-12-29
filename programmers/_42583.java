package programmers;

import java.util.LinkedList;
import java.util.Queue;

public class _42583 {

	public static void main(String[] args) {
		int bridge_length = 2;
		int weight = 10;
		int[] truck_weights = { 7, 4, 5, 6 };

		System.out.println(solution(bridge_length, weight, truck_weights));

	}

	public static int solution(int bridge_length, int weight, int[] truck_weights) {
		int answer = 0;
		Queue<Integer> queue = new LinkedList<>();

		int sum = 0;

		for (int w : truck_weights) {
			while (true) {
				if (queue.isEmpty()) {
					queue.add(w);
					sum += w;
					answer++;
					break;
				} else if (queue.size() == bridge_length) {
					sum -= queue.poll();
				} else {
					if (sum + w <= weight) {
						queue.add(w);
						sum += w;
						answer++;
						break;
					} else {
						queue.add(0);
						answer++;
					}
				}
			}
		}

		return answer + bridge_length;
	}
}