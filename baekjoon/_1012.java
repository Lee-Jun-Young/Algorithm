package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1012 {

	static int[][] arr;
	static boolean[][] checked;
	static int dx[] = { 0, 0, -1, 1 };
	static int dy[] = { -1, 1, 0, 0 };
	static int N;
	static int M;
	static int K;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine(), " ");

			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());

			arr = new int[M][N];
			checked = new boolean[M][N];

			for (int j = 0; j < K; j++) {
				st = new StringTokenizer(br.readLine(), " ");
				arr[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 1;
			}

			int cnt = 0;

			// 배추가 있으면 탐색 시작
			for (int j = 0; j < M; j++) {
				for (int k = 0; k < N; k++) {
					// 배추가 있으면서 방문하지 않았으면 dfs 탐색
					if (arr[j][k] == 1 && !checked[j][k]) {
						dfs(j, k);
						cnt++;
					}
				}
			}
			sb.append(cnt).append("\n");
		}

		System.out.println(sb);

	}

	public static void dfs(int x, int y) {
		// 방문 체크
		checked[x][y] = true;

		// 상하좌우 탐색
		for (int i = 0; i < 4; i++) {
			int nextX = x + dx[i];
			int nextY = y + dy[i];

			// 범위 안 체크
			if (nextX >= 0 && nextX < M && nextY >= 0 && nextY < N) {
				// 배추가 있으면서 방문하지 않았으면 dfs 탐색
				if (arr[nextX][nextY] == 1 && !checked[nextX][nextY]) {
					dfs(nextX, nextY);
				}
			}

		}
	}
}
