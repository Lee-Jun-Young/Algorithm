package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1300 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int k = Integer.parseInt(br.readLine());

		int start = 1;
		int end = k;
		int result = 0;

		while (start <= end) {
			int mid = (start + end) / 2;
			int cnt = 0;

			for (int i = 1; i <= N; i++)
				cnt += Math.min(mid / i, N);

			if (cnt < k)
				start = mid + 1;
			else {
				end = mid - 1;
				result = mid;
			}
		}
		System.out.println(result);
	}
}
