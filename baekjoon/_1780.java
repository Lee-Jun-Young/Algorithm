package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1780 {

	static int[][] arr;
	static int minusone_cnt = 0;
	static int zero_cnt = 0;
	static int one_cnt = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		arr = new int[N][N];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		devide(0, 0, N);

		System.out.println(minusone_cnt);
		System.out.println(zero_cnt);
		System.out.println(one_cnt);

	}

	public static void devide(int x, int y, int size) {

		if (isChecked(x, y, size)) {
			if (arr[x][y] == -1)
				minusone_cnt++;
			else if (arr[x][y] == 0)
				zero_cnt++;
			else
				one_cnt++;
			return;
		}

		devide(x, y, size / 3);
		devide(x + size / 3, y, size / 3);
		devide(x + 2 * (size / 3), y, size / 3);

		devide(x, y + size / 3, size / 3);
		devide(x + size / 3, y + size / 3, size / 3);
		devide(x + 2 * (size / 3) , y + size / 3, size / 3);

		devide(x, y + 2 * (size / 3), size / 3);
		devide(x + size / 3, y + 2 * (size / 3), size / 3);
		devide(x + 2 * (size / 3), y + 2 * (size / 3), size / 3);

	}

	public static boolean isChecked(int x, int y, int size) {

		for (int i = x; i < x + size; i++) {
			for (int j = y; j < y + size; j++) {
				if (arr[i][j] != arr[x][y])
					return false;
			}
		}
		return true;
	}

}
