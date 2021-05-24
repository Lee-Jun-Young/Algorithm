package baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11653 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int i = 2;
		
		while(N >= i) {
			if(N % i == 0) {
				sb.append(i).append("\n");
				N /= i;
			}
			else
				i++;
		}
		
		System.out.println(sb);
		
	}
	
}
