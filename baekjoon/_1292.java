package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1292 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int[] arr = new int[1000];

		int num = 1;
		int cnt = 0;

		for (int i = 0; i < 1000; i++) {
			arr[i] = num;
			cnt++;

			if (num == cnt) {
				num++;
				cnt = 0;
			}
		}

		st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int sum = 0;

		for (int i = A - 1; i <= B - 1; i++) {
			sum += arr[i];
		}

		System.out.println(sum);
	}
}