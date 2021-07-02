package programmers;

import java.util.Arrays;

public class _70129 {

	public static void main(String[] args) {
		String s = "110010101001";

		System.out.println(Arrays.toString(solution(s)));
	}

	public static int[] solution(String s) {
		int[] answer = new int[2];
		int cnt = 0;
		int zero_cnt = 0;

		while (!s.equals("1")) {
			String temp = s.replaceAll("0", "");
			cnt++;
			zero_cnt += s.length() - temp.length();
			s = Integer.toBinaryString(temp.length()).toString();
		}

		answer[0] = cnt;
		answer[1] = zero_cnt;

		return answer;
	}
}
