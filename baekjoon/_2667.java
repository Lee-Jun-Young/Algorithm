package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _2667 {
	static int[][] arr;
	static boolean[][] checked;
	static int[] num;
	static int dx[] = { 0, 0, -1, 1 };
	static int dy[] = { -1, 1, 0, 0 };
	static int N;
	static int cnt;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str;

		N = Integer.parseInt(br.readLine());

		arr = new int[N][N];
		checked = new boolean[N][N];
		num = new int[N * N];

		for (int i = 0; i < N; i++) {
			str = br.readLine();
			for (int j = 0; j < str.length(); j++) {
				arr[i][j] = str.charAt(j) - '0';
			}
		}
		cnt = 0;

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (arr[i][j] == 1 && !checked[i][j]) {
					dfs(i, j);
					cnt++;
				}
			}
		}

		sb.append(cnt).append("\n");

		Arrays.sort(num);

		for (int i = 0; i < num.length; i++) {
			if (num[i] != 0)
				sb.append(num[i]).append("\n");
		}

		System.out.println(sb);

	}

	public static void dfs(int x, int y) {
		checked[x][y] = true;
		num[cnt]++;

		for (int i = 0; i < 4; i++) {
			int nextX = x + dx[i];
			int nextY = y + dy[i];

			if (nextX >= 0 && nextX < N && nextY >= 0 && nextY < N) {
				if (arr[nextX][nextY] == 1 && !checked[nextX][nextY]) {
					dfs(nextX, nextY);
				}
			}

		}
	}
}