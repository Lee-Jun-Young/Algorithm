package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _11866 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		LinkedList<Integer> queue = new LinkedList<>();
		
		st = new StringTokenizer(br.readLine()," ");
			
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		for(int i = 1; i <= N; i++) {
			queue.add(i);
		}
		
		sb.append("<");
		
		int temp = K - 1;
		
		while(queue.size() > 1) {
			sb.append(queue.get(temp) + ", ");
			queue.remove(temp);
			temp = (temp + K - 1) % queue.size(); 
		}
		
		sb.append(queue.peek() + ">");
		
		System.out.println(sb);
	}
}


/*  
	1 2 4 5 7
	
*/