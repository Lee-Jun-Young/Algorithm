package programmers;

import java.util.Arrays;

public class _42885 {

	public static void main(String[] args) {
		int[] people = {70, 80, 50};
		int limit = 100;
		
		System.out.println(solution(people, limit));
	}
	
	public static int solution(int[] people, int limit) {
		int answer = 0;
		
		Arrays.sort(people);
		
		int i = 0;
		for(int j = people.length-1; j >= i; j--){
			if(people[j] + people[i] > limit) {
				answer++;
			}else {
				i++;
				answer++;
			}
		}
		
		return answer;
	}
}
