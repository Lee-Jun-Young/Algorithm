package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1932 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        
        int result = 0;
        
        int N = Integer.parseInt(br.readLine());
        int[][] dp = new int[N][N];
		
		dp[0][0] = Integer.parseInt(br.readLine());

		for(int i = 1; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j <= i; j++) {
				dp[i][j] = Integer.parseInt(st.nextToken());
				
				if(j == 0)
					dp[i][j] += dp[i-1][j];
				else if(j == i)
					dp[i][j] += dp[i-1][j-1];
				else
					dp[i][j] += Math.max(dp[i-1][j-1], dp[i-1][j]);
			}
		}
		
		for(int i = 0; i < N; i++) {
			result = Math.max(result, dp[N-1][i]);
		}
		
		System.out.println(result);
	}
}