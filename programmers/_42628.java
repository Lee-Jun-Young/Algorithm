package programmers;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class _42628 {

	public static void main(String[] args) {
		String[] operations = { "I 16", "D 1" };

		System.out.println(Arrays.toString(solution(operations)));
	}

	public static int[] solution(String[] operations) {
		int[] answer = { 0, 0 };

		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());

		for (String str : operations) {
			String[] temp = str.split(" ");

			if (temp[0].equals("I")) {
				minHeap.add(Integer.parseInt(temp[1]));
				maxHeap.add(Integer.parseInt(temp[1]));
			} else {
				if (!minHeap.isEmpty()) {
					if (Integer.parseInt(temp[1]) < 0) {
						int min = minHeap.peek();
						minHeap.remove(min);
						maxHeap.remove(min);
					} else {
						int max = maxHeap.peek();
						minHeap.remove(max);
						maxHeap.remove(max);
					}
				}
			}
		}

		if (!minHeap.isEmpty()) {
			answer[0] = maxHeap.poll();
			answer[1] = minHeap.poll();
		}

		return answer;
	}
}
