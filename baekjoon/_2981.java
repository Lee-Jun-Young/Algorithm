package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _2981 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		int num = arr[1] - arr[0];
		for(int i = 2; i < arr.length; i++) {
			num = GCD(num, arr[i] - arr[i-1]);
		}
		
		for(int i = 2; i <= num; i++) {
			if(num % i == 0) {
				sb.append(i + " ");
			}
		}
		System.out.println(sb);
	}
	
	// 최대 공약수
	public static int GCD(int a, int b) {
		int temp = 0;
		while(b > 0) {
			temp = a % b;
			a = b;
			b = temp;
		}
		return a;
	}

}
