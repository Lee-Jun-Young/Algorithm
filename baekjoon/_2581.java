package baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2581 {
	public static boolean check[];
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int sum = 0;
		int start = Integer.parseInt(br.readLine());
		int end = Integer.parseInt(br.readLine());
		
		check = new boolean[end + 1];
		
		check_prime();
		
		for(int i = start; i <= end; i++) {
			if(!check[i]) {
				if(sum == 0) {
					sb.append(i);
				}
				sum += i;
			}
		}
		
		if(sum == 0) {
			sb.append(-1);
		}
		else {
			sb.insert(0, sum + "\n");
		}
		
		System.out.println(sb);
		
	}
	
	public static void check_prime() {
		
		check[1] = true;
        
        for(int i= 2; i < check.length; i++) {
            for(int j = 2; i*j < check.length; j++) {
                check[i*j] = true;
            }
        }
        
	}
	
}
