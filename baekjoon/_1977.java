package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class _1977 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int sum = 0;
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 1; i <= 100; i++) {
			int temp = (int)Math.pow(i, 2);
			if(temp >= M && temp <= N) {
				list.add(temp);
				sum += temp;
			}
		}
		
		if(list.size() == 0)
			System.out.println(-1);
		else {
			System.out.println(sum);
			System.out.println(list.get(0));
		}
	}
}
