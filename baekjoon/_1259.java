package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1259 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		boolean flag = true;
		
		while(true) {
			String str = br.readLine();
			flag = true;
			
			if(str.equals("0"))
				break;
			
			int len = str.length()/2;
			int temp = str.length()-1;
			
			for(int i = 0; i < len; i++) {
				if(str.charAt(i) != str.charAt(temp-i)) {
					flag = false;
				}
			}
			
			if(flag) 
				sb.append("yes").append("\n");
			else 
				sb.append("no").append("\n");
		}
		System.out.println(sb);
	}
}
