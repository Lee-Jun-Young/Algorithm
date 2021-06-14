package programmers;

import java.util.Stack;

public class _60058 {
	public static void main(String[] args) {
		String str = "()))((()";
		
		System.out.println(solution(str));
	}
	
	public static String solution(String str) {
		// 입력이 빈 문자열인 경우, 빈 문자열 반환
		if(str.isEmpty()) return "";
		
		int index = splitString(str);
		String u = str.substring(0,index);
		String v = str.substring(index);
		
		// u가 올바른 괄호 문자열인 경우
		if(isCorrect(u)) {
			return u + solution(v);
		}
		
		// u가 올바른 괄호 문자열이 아닌 경우
		String answer = "(" + solution(v) + ")";
		
		// u의 첫 번쨰와 마지막 문자를 제거하고, 나머지 문자열의 괄호 방향을 뒤집어서 뒤에 붙임.
		for(int i = 1; i < u.length() - 1; i++) {
			if(u.charAt(i) == '(')
				answer += ")";
			else
				answer += "(";
		}
		
		return answer;
	}
	
	// 문자열 u, v로 나누는 인덱스 찾기
	public static int splitString(String str) {		
		int cnt = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '(')
				cnt++;
			else
				cnt--;
			
			if(cnt == 0) {
				return i+1;
			}			
		}
		return -1;
	}
	
	// 올바른 괄호인지 판별
	public static boolean isCorrect(String str) {
		Stack<Character> stack = new Stack<Character>();
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '(') {
				stack.push('(');
			}
			else {
				if(!stack.isEmpty() && stack.peek() == '(')
					stack.pop();
				else
					return false;
			}
		}
		return true;
	}

}