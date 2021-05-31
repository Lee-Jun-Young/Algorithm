package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class _1021 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		int cnt = 0;
		
		st = new StringTokenizer(br.readLine()," ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine()," ");
		
		for(int i = 0; i < N; i++) {
			list.add(i+1);
		}
		
		for(int i = 0; i < M; i++) {
			int temp = Integer.parseInt(st.nextToken());
			
			int idx = list.indexOf(temp);
			
			if(idx <= list.size() / 2) {
				for(int j = 0; j < idx; j++) {
					list.add(list.pollFirst());
					cnt++;
				}
			}else {
				for(int j = 0; j < list.size()-idx; j++) {
					list.push(list.pollLast());
					cnt++;
				}
			}
			list.pop();
		}
		System.out.println(cnt);
	}

}

