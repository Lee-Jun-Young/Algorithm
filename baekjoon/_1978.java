package baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1978 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int cnt = 0;
		int N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine()," ");
		
		while(st.hasMoreTokens()) {
			
			boolean flag = true;
			
			int temp = Integer.parseInt(st.nextToken());
			
			if(temp == 1)
				continue;
			
			for(int i = 2; i <= temp / 2; i++) {
				if(temp % i == 0) {
					flag = false;
					break;
				}
			}
			
			if(flag)
				cnt++;
		}
        
        System.out.println(cnt);
    }
	
}

