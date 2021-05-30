package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2490 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		for(int i = 0; i < 3; i++) {
			int cnt = 0;
			
			st = new StringTokenizer(br.readLine()," ");
			
			while(st.hasMoreTokens()) {
				if(Integer.parseInt(st.nextToken()) == 1)
					cnt++;
			}
			
			switch(cnt) {
				case 0: 
					sb.append("D").append("\n");
					break;
				case 1: 
					sb.append("C").append("\n");
					break;
				case 2: 
					sb.append("B").append("\n");
					break;
				case 3: 
					sb.append("A").append("\n");
					break;
				case 4: 
					sb.append("E").append("\n");
					break;
			}
		}
		
		System.out.println(sb);
		
	}

}
