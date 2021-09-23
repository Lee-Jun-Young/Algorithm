package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _15988 {
	static long[] dp;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		dp = new long[1000001];
		dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        
		int T = Integer.parseInt(br.readLine());
        
		for(int i = 0; i < T; i++) {
			int temp = Integer.parseInt(br.readLine());
			sb.append(dpCheck(temp)).append("\n");
		}
		System.out.println(sb);
		
	}
	
	static long dpCheck(int num) {
        
        for(int i = 4; i <= num; i++) {
        	dp[i] = (dp[i-1] + dp[i-2] + dp[i-3]) % 1000000009;
        }
        return dp[num];
	}

}