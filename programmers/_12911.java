package programmers;

public class _12911 {

	public static void main(String[] args) {
		int n = 78;

		System.out.println(solution(n));
	}

	public static int solution(int n) {
		int answer = 0;
		// 2������ ��ȯ
		String str = Integer.toBinaryString(n);

		int cnt = 0;
		// 1�� ������ üũ
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '1')
				cnt++;
		}
		// n ���������� 2������ ��ȯ
		for (int i = n + 1;; i++) {
			String temp = Integer.toBinaryString(i);

			int temp_cnt = 0;
			// n ���� ū ���ڵ��� 2������ ��ȯ���� �� 1�� ����
			for (int j = 0; j < temp.length(); j++) {
				if (temp.charAt(j) == '1')
					temp_cnt++;
			}
			// 1�� ������ ���� ��
			if (cnt == temp_cnt) {
				answer = i;
				break;
			}
		}
		return answer;
	}
}
