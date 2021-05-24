package baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1003 {
	public static int[] zero_cnt = new int[41];
	public static int[] one_cnt = new int[41];
	
	public static void main(String[] args) throws IOException {	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
		
        init();
        
        int N = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < N; i++) {
        	int num = Integer.parseInt(br.readLine());
        	sb.append(zero_cnt[num] + " " + one_cnt[num] + "\n");
        }
        
        System.out.println(sb);
        
	}
	
	public static void init() {
		zero_cnt[0] = 1;
        zero_cnt[1] = 0;
        one_cnt[0] = 0;
        one_cnt[1] = 1;
        
        for(int i = 2; i < 41; i++) {
        	zero_cnt[i] = zero_cnt[i-1] + zero_cnt[i-2];
        	one_cnt[i] = one_cnt[i-1] + one_cnt[i-2];
        }
	}
	
}