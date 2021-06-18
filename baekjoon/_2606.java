package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2606 {
	public static int[][] arr;
	public static boolean[] visited;
	static int cnt = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		int V = Integer.parseInt(br.readLine());
		int M = 1;

		arr = new int[N + 1][N + 1];
		visited = new boolean[N + 1];

		for (int i = 1; i <= V; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[a][b] = 1;
			arr[b][a] = 1;
		}

		visited = new boolean[N + 1];
		dfs(M);

		System.out.println(cnt);
	}

	public static void dfs(int m) {
		visited[m] = true;

		if (m == arr.length) {
			return;
		}

		for (int i = 1; i < arr.length; i++) {
			if (arr[m][i] == 1 && visited[i] == false) {
				cnt++;
				dfs(i);
			}
		}
	}

}
