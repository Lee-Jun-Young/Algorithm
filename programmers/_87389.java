package programmers;

public class _87389 {

	public static void main(String[] args) {

		int n = 12;

		System.out.println(solution(n));
	}

	public static int solution(int n) {

		for (int i = 2; i < n / 2; i++) {
			if (n % i == 1) {
				return i;
			}
		}

		return n - 1;
	}

}
