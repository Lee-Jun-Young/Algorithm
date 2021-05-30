package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _1475 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[10];
		
		String N = br.readLine();
		
		for(int i = 0; i < N.length(); i++) {
			int temp = N.charAt(i) - '0';
			if(temp == 6)
				temp = 9;
			arr[temp]++;
		}
		
		if(arr[9] % 2 == 0)
			arr[9] /= 2;
		else
			arr[9] = arr[9] / 2 + 1;
		
		Arrays.sort(arr);
		
		System.out.println(arr[9]);
	}
}
