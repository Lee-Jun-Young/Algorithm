package programmers;

import java.util.Arrays;

public class _42584 {

	public static void main(String[] args) {

		int[] prices = { 1, 2, 3, 2, 3 };

		System.out.println(Arrays.toString(solution(prices)));
	}

	public static int[] solution(int[] prices) {
		int[] answer = new int[prices.length];

		for (int i = 0; i < prices.length; i++) {
			int temp = prices[i];
			int cnt = 0;
			for (int j = i + 1; j < prices.length; j++) {
				if (temp <= prices[j])
					cnt++;
				else {
					cnt++;
					break;
				}
			}
			answer[i] = cnt;
		}

		return answer;
	}

}
