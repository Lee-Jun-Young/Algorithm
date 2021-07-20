package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11729 {
	static int cnt = 0;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		hanoi(N, 1, 3, 2);
		System.out.println(cnt);
		System.out.println(sb);
	}

	public static void hanoi(int N, int start, int end, int sub) {
		if (N == 0)
			return;
		else {
			cnt++;
			hanoi(N - 1, start, sub, end);
			sb.append(start + " " + end).append("\n");
			hanoi(N - 1, sub, end, start);
		}
	}
}
