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
			
			int temp = str.length();
			
			for(int i = 0; i < temp/2; i++) {
				if(str.charAt(i) != str.charAt(temp-i-1)) {
					flag = false;
				}
			}
			if(flag) {
				sb.append("yes").append("\n");
			}else {
				sb.append("no").append("\n");
			}
		}
		
		System.out.println(sb);

	}
}
