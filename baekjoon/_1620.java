package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class _1620 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine()," ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		String[] arr = new String[N+1];
		
		for(int i = 1; i < N+1; i++) {
			String input = br.readLine();
			hashMap.put(input, i);
			arr[i] = input;
		}
		
		for(int i = 0; i < M; i++) {
			String temp = br.readLine(); 
			if(!isNumber(temp)) {
				sb.append(hashMap.get(temp)).append("\n");
			}else {
				sb.append(arr[Integer.parseInt(temp)]).append("\n");
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
