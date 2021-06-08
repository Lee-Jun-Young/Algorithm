package programmers;

import java.util.Stack;

public class _76502 {
	public static void main(String[] args) {
		String str = "[](){}";
		
		String temp = str;
		int cnt = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if(solution(temp))
				cnt++;
			temp = temp.substring(1,str.length()) + temp.charAt(0);
		}
		
		System.out.println(cnt);
	}
	
	public static boolean solution(String str) {
		Stack<Character> stack = new Stack<Character>();
			
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c == '(' || c == '{' || c =='[') 
				stack.add(c);
			
			else if(!stack.isEmpty()) {
				if(c == ')' && stack.peek() == '(')
					stack.pop();
				else if(c == '}' && stack.peek() == '{')
					stack.pop();
				else if(c == ']' && stack.peek() == '[')
					stack.pop();
			}
			else 
				return false;
			
		}
		return stack.isEmpty()? true : false;
	}
}
