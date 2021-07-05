package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1018 {

	static char[][] white = { { 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' }, { 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' },
			{ 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' }, { 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' },
			{ 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' }, { 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' },
			{ 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' }, { 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' } };
	static char[][] black = { { 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' }, { 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' },
			{ 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' }, { 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' },
			{ 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' }, { 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' },
			{ 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' }, { 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' } };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine(), " ");

		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int min = 64;

		char[][] arr = new char[M][N];

		for (int i = 0; i < M; i++) {
			String temp = br.readLine();
			for (int j = 0; j < N; j++) {
				arr[i][j] = temp.charAt(j);
			}
		}

		for (int i = 0; i < M - 7; i++) {
			for (int j = 0; j < N - 7; j++) {
				int white_cnt = 0;
				int black_cnt = 0;

				for (int k = 0; k < 8; k++) {
					for (int t = 0; t < 8; t++) {
						if (arr[i + k][j + t] != white[k][t])
							white_cnt++;
					}
				}

				for (int k = 0; k < 8; k++) {
					for (int t = 0; t < 8; t++) {
						if (arr[i + k][j + t] != black[k][t])
							black_cnt++;
					}
				}
				min = Math.min(min, Math.min(white_cnt, black_cnt));
			}
		}
		System.out.println(min);
	}
}
