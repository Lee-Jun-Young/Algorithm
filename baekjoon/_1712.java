package baekjoon;
import java.util.*;
import java.io.*;

public class _1712 {
	
	public static void main(String []args) throws IOException{
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine()," ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		int num = 0;
		
		while(true) {
			if(C <= B) {
				System.out.println("-1");
				break;
			}
			else if(A + B * num >= C * num) {
				num++;
			}
			else { 
				System.out.println(num);
				break;	
			}	
		}
		
	}   
	
}

