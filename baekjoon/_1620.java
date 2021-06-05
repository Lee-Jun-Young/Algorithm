package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class _1620 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine()," ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		ArrayList<String> list = new ArrayList<String>();
		
		for(int i = 0; i < N; i++) {
			list.add(br.readLine()); 
		}
		
		for(int i = 0; i < M; i++) {
			String temp = br.readLine(); 
			if(!isNumber(temp)) {
				sb.append(list.indexOf(temp)+1).append("\n");
			}else {
				sb.append(list.get(Integer.parseInt(temp)-1)).append("\n");
			}
		}

		System.out.println(sb);
	}
	
	public static boolean isNumber(String str) {
		
		try {
			Double.parseDouble(str);
			return true;
		}catch(NumberFormatException e) {
			return false;
		}
	}
	

}
