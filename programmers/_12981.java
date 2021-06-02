package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class _12981 {

	public static void main(String[] args) {
		
		int n = 3;
		String[] arr = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
		
		System.out.println(Arrays.toString(solution(n, arr)));
	}

	public static int[] solution(int n, String[] words) {
		int[] answer = new int[2];
		
		ArrayList<String> list = new ArrayList<String>();
		boolean flag = true;
		
		list.add(words[0]);
		
		for(int i = 1; i < words.length; i++){
			if(list.contains(words[i])){
				answer[0] = (i%n) + 1;
				answer[1] = (i/n) + 1;
				flag = false;
				break;
			}
			
			list.add(words[i]);
			
			if(words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)){
				answer[0] = (i%n) + 1;
				answer[1] = (i/n) + 1;
				flag = false;
				break;
			}
		}
		
		if(flag){
			answer[0] = 0;
			answer[1] = 0;
			return answer;
		}
		
		return answer;
	}
}
