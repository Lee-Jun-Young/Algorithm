package programmers;

import java.util.Stack;

public class _60058 {
	public static void main(String[] args) {
		String str = "()))((()";
		
		System.out.println(solution(str));
	}
	
	public static String solution(String str) {
		// �Է��� �� ���ڿ��� ���, �� ���ڿ� ��ȯ
		if(str.isEmpty()) return "";
		
		int index = splitString(str);
		String u = str.substring(0,index);
		String v = str.substring(index);
		
		// u�� �ùٸ� ��ȣ ���ڿ��� ���
		if(isCorrect(u)) {
			return u + solution(v);
		}
		
		// u�� �ùٸ� ��ȣ ���ڿ��� �ƴ� ���
		String answer = "(" + solution(v) + ")";
		
		// u�� ù ������ ������ ���ڸ� �����ϰ�, ������ ���ڿ��� ��ȣ ������ ����� �ڿ� ����.
		for(int i = 1; i < u.length() - 1; i++) {
			if(u.charAt(i) == '(')
				answer += ")";
			else
				answer += "(";
		}
		
		return answer;
	}
	
	// ���ڿ� u, v�� ������ �ε��� ã��
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
	
	// �ùٸ� ��ȣ���� �Ǻ�
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