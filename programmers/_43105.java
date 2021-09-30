package programmers;

public class _43105 {
	public static void main(String[] args) {
		int[][] triangle = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
		
		System.out.println(solution(triangle));
	}

	public static int solution(int[][] triangle) {
		int answer = 0;
		int[][] dp = new int[501][501];
		dp[0][0] = triangle[0][0];
		
		for(int i = 1; i < triangle.length; i++) {
			for(int j = 0; j <= i; j++) {
				if(j == 0)
					dp[i][j] = triangle[i][j] + dp[i-1][j];
				else if(j == i)
					dp[i][j] = triangle[i][j] + dp[i-1][j-1];
				else
					dp[i][j] = triangle[i][j] + Math.max(dp[i-1][j], dp[i-1][j-1]);
			}
		}
		
		answer = dp[triangle.length-1][0];
		
		for(int i = 1; i < triangle.length; i++) {
			answer = Math.max(answer, dp[triangle.length-1][i]);
		}
		
		return answer;
	}
}
