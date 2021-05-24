package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class _2164 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		Queue<Integer> queue = new LinkedList<>();
		
		int N = Integer.parseInt(br.readLine());
		int temp = 0;
		
		for(int i = 0; i < N; i++) {
			queue.add(i+1);
		}
		
		while(queue.size() > 1) {
			queue.remove();
			temp = queue.peek();
			queue.remove();
			queue.add(temp);
		}
		
		System.out.println(queue.peek());
		
	}
}
