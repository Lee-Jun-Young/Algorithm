package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2580 {

	static int[][] arr = new int[9][9];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		for (int i = 0; i < 9; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < 9; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		sudoku(0, 0);
	}

	public static void sudoku(int row, int col) {
		StringBuilder sb = new StringBuilder();

		if (col == 9) {
			sudoku(row + 1, 0);
			return;
		}

		if (row == 9) {
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					sb.append(arr[i][j] + " ");
				}
				sb.append("\n");
			}

			System.out.println(sb);
			System.exit(0);
		}

		int temp = arr[row][col];
		if (temp == 0) {
			for (int i = 1; i < 10; i++) {
				if (isChecked(i, row, col)) {
					arr[row][col] = i;
					sudoku(row, col + 1);
				}
			}
			arr[row][col] = 0;
			return;
		}

		sudoku(row, col + 1);
	}

	public static boolean isChecked(int N, int row, int col) {

		// 행 체크
		for (int i = 0; i < 9; i++) {
			if (N == arr[row][i])
				return false;
		}

		// 열 체크
		for (int i = 0; i < 9; i++) {
			if (N == arr[i][col])
				return false;
		}

		// 3 X 3 사각형 체크
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
