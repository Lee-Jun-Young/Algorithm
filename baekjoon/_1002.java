package baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1002 {
	public static void main(String[] args) throws IOException {	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			
			st = new StringTokenizer(br.readLine()," ");
			
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());
			
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());
			
			int A = (int) (Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
			int B = (int) Math.pow(r1 + r2, 2);
			
			if(x1 == x2 && y1 == y2 && r1 == r2)
				sb.append(-1 + "\n");
			
			else if(A > B)
				sb.append(0 + "\n");
			
			else if(A == B)
				sb.append(1 + "\n");
			
			else if(A < (int) Math.pow(r2 - r1, 2))
				sb.append(0 + "\n");
			
			else if(A == (int) Math.pow(r2 - r1, 2))
				sb.append(1 + "\n");
			
			else
				sb.append(2 + "\n");
		}
		
		System.out.println(sb);
	}

}

/*
 
 	2 1 2 8
	(x2 - x1) + (y2 - y1)
*/