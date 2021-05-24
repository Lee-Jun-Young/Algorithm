package baekjoon;
import java.io.*;

public class _2292 {
	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int N = Integer.parseInt(br.readLine());
		
		// 지나가는 방의 개수
		int cnt = 1;
		
		while(true) {
			int num = cnt - 1;
			// 범위의 끝 값(1, 7, 19, 37, 61......)
			int temp = 6 * (num * (num + 1) / 2) + 1;
			
			if(N <= temp) {
				System.out.println(cnt);
				break;
			}
			
			cnt++;
			
		}
	}
}

/*
	1 2 3  4  5
	1 6 12 18 24
	1 7 19 37 61
	0 1 3  5  10
	1 1 1  1  1
*/