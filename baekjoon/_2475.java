package baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2475 {
	public static void main(String[] args) throws IOException {	
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine()," ");
		int result = 0;
		
		while(st.hasMoreTokens()) {
			int temp = Integer.parseInt(st.nextToken());
			result += temp * temp;
		}
		
		System.out.println(result % 10);
	}   
}
