package programmers;

import java.util.Arrays;

public class _86051 {

	public static void main(String[] args) {
		
		int[] numbers = {5,8,4,0,6,7,9};
		
		System.out.println(solution(numbers));

	}
	
    public static int solution(int[] numbers) {
    	
    	boolean[] check = new boolean[10];
    	Arrays.fill(check, false);
    	
        int answer = 0;
        for(int temp : numbers) {
        	check[temp] = true;
        }
        
        for(int i = 0; i < check.length; i++) {
        	if(!check[i])
        		answer += i;
        }
        
        return answer;
    }
	

}
