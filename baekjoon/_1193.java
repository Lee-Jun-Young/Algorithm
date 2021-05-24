package baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1193 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int N = Integer.parseInt(br.readLine());
		
		int line = 0;
		int num = 0;
		
		// 몇 번째 대각선인지 찾기
		for(int i = 0; i <= N; i++) {
			num += i;
			if(num >= N) {
				line = i;
				break;
			}
		}
		
		if(line % 2 == 0)
			System.out.println(line - (num - N) + "/" + (1 + num - N));
		else
			System.out.println((1 + num - N) + "/" + (line - (num - N)));
		
	}
}


/*
	1 2 3 4 5
	1 2 3 4 5 
	1 3 6 10 15
*/