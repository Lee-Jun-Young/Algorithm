package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _2460 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int[] arr = new int[10];

		for (int i = 0; i < 10; i++) {
			st = new StringTokenizer(br.readLine());
			int down = Integer.parseInt(st.nextToken());
			int up = Integer.parseInt(st.nextToken());

			if (i == 0)
				arr[i] = up - down;
			else
				arr[i] = Math.max(arr[i - 1] - down, arr[i - 1] - down + up);
		}
		Arrays.sort(arr);
		System.out.println(arr[9]);
	}
}
