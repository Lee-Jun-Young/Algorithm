package baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1011 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine()," ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			int distance = y - x;
			int temp = (int)Math.sqrt(distance);

			int cnt = 0;
						
			if(temp == Math.sqrt(distance)) {
				cnt = 2 * temp - 1;
				sb.append(cnt).append("\n");
			}
			else if(distance <= temp * temp + temp) {
				cnt = 2 * temp;
				sb.append(cnt).append("\n");
			}
			else {
				cnt = 2 * temp + 1;
				sb.append(cnt).append("\n");
			}
			
		}
		System.out.println(sb);
	}
}



/*
y			1	2	3	4	5	6	7	8	9	10	11	12	13	14	15	16
distance	1	2	3	4	5	6	7	8	9	10	11	12	13	14	15	16
cnt			1	2	3	3	4	4	5	5	5	6	6

1 / 1 / 22 / 22 / 333 / 333 / 4444 / 5555 / 99999 / 101010101010



*/	
