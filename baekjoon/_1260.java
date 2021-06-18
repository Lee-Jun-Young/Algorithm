package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _1260 {
	public static int[][] arr;
	public static boolean[] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		arr = new int[N + 1][N + 1];

		for (int i = 1; i <= V; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[a][b] = 1;
			arr[b][a] = 1;
		}

		visited = new boolean[N + 1];
		dfs(M);

		System.out.println();

		visited = new boolean[N + 1];
		bfs(M);

	}

	public static void dfs(int start) {
		visited[start] = true;
		System.out.print(start + " ");

		if (start == arr.length) {
			return;
		}

		for (int a = 1; a < arr.length; a++) {
			if (arr[start][a] == 1 && visited[a] == false) {
				dfs(a);
			}
		}
	}

	public static void bfs(int start) {
		Queue<Integer> que = new LinkedList<Integer>();

		que.add(start);
		visited[start] = true;
		System.out.print(start + " ");

		while (!que.isEmpty()) {

			int temp = que.peek();
			que.poll();
			for (int i = 1; i < arr.length; i++) {
				if (arr[temp][i] == 1 && visited[i] == false) {
					que.add(i);
					visited[i] = true;
					System.out.print(i + " ");
				}
			}
		}
	}
	
}