package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class _1927 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
		
		int N = Integer.parseInt(br.readLine());
		
		while(N > 0) {
			int temp = Integer.parseInt(br.readLine());
			
			if(temp == 0) {
				if(heap.isEmpty())
					sb.append("0").append("\n");
				else
					sb.append(heap.poll()).append("\n");
			}
			else
				heap.add(temp);
			
			N--;
		}
		System.out.println(sb);
	}
}
