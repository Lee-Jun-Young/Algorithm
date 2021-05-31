package programmers;

import java.util.Arrays;

public class _42842 {
	public static void main(String[] args) {
		int brown = 10;
		int yellow = 2;
		
		System.out.println(Arrays.toString(solution(brown,yellow)));
	}
	
	public static int[] solution(int brown, int yellow) {
			
		int[] answer = new int[2];
		        
		int total = brown + yellow;
		
		for(int i = total; i >= 3; i--){
			if(total % i == 0){
				int X = total / i;
				int Y = total / X;
				
				if((X-2) * (Y-2) == yellow){
					answer[0] = X;
					answer[1] = Y;
				}
			}
		}
		return answer;
	}
}
