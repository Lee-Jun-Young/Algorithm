package programmers;

import java.io.IOException;
import java.util.Arrays;

public class _77484 {
	public static void main(String[] args) throws IOException {
		
		int[] lottos = {0, 0, 0, 0, 0, 0};
		int[] win_nums = {38, 19, 20, 40, 15, 25};
			
		solution(lottos, win_nums);
		
	}
	
	public static void solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        int cnt = 0;
        int unknown = 0;
        int MAX_RANK = 0;
        int MIN_RANK = 0;
        
        Arrays.sort(win_nums);
        
        for(int i = 0; i < 6; i++) {
        	if(Arrays.binarySearch(win_nums, lottos[i]) >= 0)
        		cnt++;
        	if(lottos[i] == 0)
        		unknown++;
        }
        
        MAX_RANK = cnt + unknown;
        MIN_RANK = cnt;
        
        answer[0] = Math.min(7 - MAX_RANK, 6);
        answer[1] = Math.min(7 - MIN_RANK, 6);
        
        for(int i = 0; i < 2; i++) {
        	System.out.println(answer[i]);
        }
        
    }
	
}


