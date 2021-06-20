package programmers;

public class _12980 {

	public static void main(String[] args) {
		int N = 5000;

		System.out.println(solution(N));
	}

	public static int solution(int n) {
		int ans = 0;

		while (n != 0) {
			if (n % 2 == 0)
				n /= 2;
			else {
				n -= 1;
				System.out.println(n);
				ans++;
			}
		}
		return ans;
	}
}
