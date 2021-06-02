package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _1874 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		Stack<Integer> stack = new Stack<Integer>();
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		int idx = 0;
		
		for(int i = 1; i <= n; i++) {
			stack.push(i);
			sb.append("+").append("\n");
			
			while(!stack.isEmpty()) {
				if(stack.peek() == arr[idx]) {
					stack.pop();
					sb.append("-").append("\n");
					idx++;
				}else {
					break;
				}
			}	
		}
		
		if(!stack.isEmpty()) {
			System.out.println("NO");
		}else {
			System.out.println(sb);
		}
	}
}
