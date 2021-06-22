package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _3460 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			String binaryN = Integer.toBinaryString(n);
			for(int j = binaryN.length()-1; j >= 0; j--) {
				if(binaryN.charAt(j) == '1')
					sb.append(binaryN.length()-j-1 + " ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
