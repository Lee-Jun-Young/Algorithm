package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2580 {

	static int[][] arr = new int[9][9];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		for (int i = 0; i < 9; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < 9; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				int temp = arr[i][j];
				if (temp == 0) {
					for (int k = 1; k < 10; k++) {
						if (rowCheck(k, i) && colCheck(k, j) && squareCheck(k, i, j))
							arr[i][j] = k;
					}
				} 
			}
		}

		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				sb.append(arr[i][j] + " ");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
		
	}

	public static boolean rowCheck(int N, int num) {
		for (int i = 0; i < 9; i++) {
			if (N == arr[num][i])
				return false;
		}
		return true;
	}

	public static boolean colCheck(int N, int num) {
		for (int i = 0; i < 9; i++) {
			if (N == arr[i][num])
				return false;
		}
		return true;
	}

	public static boolean squareCheck(int N, int row, int col) {
		int tempX = row / 3 * 3;
		int tempY = col / 3 * 3;

		for (int i = tempX; i < tempX + 3; i++) {
			for (int j = tempY; j < tempY + 3; j++) {
				if (N == arr[i][j])
					return false;
			}
		}
		return true;
	}

}
