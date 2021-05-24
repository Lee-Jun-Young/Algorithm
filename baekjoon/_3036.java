package baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _3036 {
	public static void main(String[] args) throws IOException {	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        
        st = new StringTokenizer(br.readLine(), " ");
        
        int A = Integer.parseInt(st.nextToken());
	     
        for(int i = 0; i < N - 1; i++) {
        	
        	int B = Integer.parseInt(st.nextToken());
        	
        	int temp = gcd(A, B);
        	
		    sb.append(A / temp).append("/").append(B / temp).append("\n");
        }
        
	    System.out.println(sb);
	}
	
	static int gcd(int a, int b) {
		int r;
		
		while(b != 0) {
			r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
	
}
