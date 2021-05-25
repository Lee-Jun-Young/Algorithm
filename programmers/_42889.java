package programmers;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class _42889 {
	public static void main(String[] args) throws IOException {
			
		int N = 5;
		int[] stages = {2,1,2,4,2,4,3,3};
			
		int[] result = solution(N, stages);; 
		
		System.out.println(Arrays.toString(result));
	}
	
	public static int[] solution(int N, int[] stages) {
		
		int[] answer = new int[N];
		int[] player = new int[N+2];
		int[] stage = new int[N+2];
		double[][] fail = new double[N][2];
		
		for(int value : stages) {
			stage[value]++;
		}
		
		player[0] = stages.length;
		for(int i = 1; i < N+2; i++) {
			player[i] = player[i-1] - stage[i-1];
		}
		
		for(int i = 1; i < N+1; i++) {
			if(player[i] == 0) {
				fail[i-1][0] = -1;
			}else {
				fail[i-1][0] = stage[i] / (double)player[i];
			}
			
			fail[i-1][1] = i;
		}
		
		Arrays.sort(fail, new Comparator<double[]>() {
			@Override
			public int compare(double[] o1, double[] o2) {
				// TODO Auto-generated method stub
				if(o1[0] == o2[0]) return 0;
				return (o1[0] < o2[0])? 1:-1;
			}
		});
		
		for(int i = 0; i< N; i++) { 
			answer[i] = (int) fail[i][1];
		}
		
		return answer;
	}	
}