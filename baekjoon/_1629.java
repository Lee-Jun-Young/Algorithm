package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1629 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine(), " ");

		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());

		System.out.println(devide(A, B, C));

	}

	public static long devide(int A, int B, int C) {
		if (B == 0)
			return 1;

		if (B == 1)
			return A % C;

		long temp = devide(A, B / 2, C);

		if (B % 2 == 0)
			return temp * temp % C;
		else
			return (temp * temp % C) * A % C;

	}

}
