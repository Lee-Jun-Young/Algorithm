package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class _1966 {
	
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		    	
		int cnt = 0;
		int j = 0;
		int N = 0;
		int M = 0;
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < num; i++) {
			LinkedList<int[]> queue = new LinkedList<>();
			st = new StringTokenizer(br.readLine()," ");
			j = 0;
			cnt = 0;
			
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine()," ");
			
			while(st.hasMoreTokens()) {
				queue.add(new int[] {j, Integer.parseInt(st.nextToken())});
				j++;
			}
			
			while(!queue.isEmpty()) {
				int[] temp = queue.poll();
				boolean flag = true;
				
				for(int[] q : queue) {
					if(q[1] > temp[1]) {
						flag = false;
					}
				}
				if(flag) {
					cnt++;
					if(temp[0] == M) break;
				}
				else queue.add(temp);
			}
			
			sb.append(cnt).append("\n");
		}
		    	
		System.out.println(sb);
	}
}