package baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _3053 {
	public static void main(String[] args) throws IOException {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	
	double pie = 3.141592653589;
	
	double R = Integer.parseInt(br.readLine());
	
	System.out.printf("%06f",pie * R * R);
	System.out.println();
	System.out.printf("%06f",2 * R * R);
		
	}
}

