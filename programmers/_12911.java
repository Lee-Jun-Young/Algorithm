package programmers;

public class _12911 {

	public static void main(String[] args) {
		int n = 78;

		System.out.println(solution(n));
	}

	public static int solution(int n) {
		int answer = 0;
		// 2진수로 변환
		String str = Integer.toBinaryString(n);

		int cnt = 0;
		// 1의 개수를 체크
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '1')
				cnt++;
		}
		// n 다음수부터 2진수로 변환
		for (int i = n + 1;; i++) {
			String temp = Integer.toBinaryString(i);

			int temp_cnt = 0;
			// n 다음 큰 숫자들을 2진수로 변환했을 때 1의 갯수
			for (int j = 0; j < temp.length(); j++) {
				if (temp.charAt(j) == '1')
					temp_cnt++;
			}
			// 1의 갯수가 같을 때
			if (cnt == temp_cnt) {
				answer = i;
				break;
			}
		}
		return answer;
	}
}
