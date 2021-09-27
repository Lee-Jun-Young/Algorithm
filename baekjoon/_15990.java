package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _15990 {
	static long[][] dp;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		dp = new long[100001][4];
		dp[1][1] = 1;
		dp[2][2] = 1;
		dp[3][1] = 1;
		dp[3][2] = 1;
		dp[3][3] = 1;		
		
		for(int i = 4; i <= 100000; i++) {
			dp[i][1] = (dp[i-1][2] + dp[i-1][3]) % 1000000009;
			dp[i][2] = (dp[i-2][1] + dp[i-2][3]) % 1000000009;
			dp[i][3] = (dp[i-3][1] + dp[i-3][2]) % 1000000009;
		}
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			int temp = Integer.parseInt(br.readLine());
			sb.append((dp[temp][1] + dp[temp][2] + dp[temp][3]) % 1000000009).append("\n");
		}
		
		System.out.println(sb);
	}

}
