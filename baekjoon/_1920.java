package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _1920 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine()," ");
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine()," ");
		
		for(int i = 0; i < M; i++) {
			// Arrays.binarySearch(배열, 찾고자 하는 값) : 값이 존재한다면 인덱스 값을, 존재하지 않다면 음수를 리턴
			int temp = Arrays.binarySearch(arr, Integer.parseInt(st.nextToken()));
			if(temp >= 0)
				sb.append(1).append("\n");
			else
				sb.append(0).append("\n");
		}
		System.out.println(sb);
	}
}
