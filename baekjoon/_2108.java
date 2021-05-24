package baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class _2108 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> list = new ArrayList<>();
		int arr[] = new int[N];
		int sum = 0;
		int check[] = new int[8001];
		
		for(int i = 0; i < N; i++) {
			int temp = Integer.parseInt(br.readLine());
			arr[i] = temp;
			sum += arr[i];
			check[temp + 4000]++;
		}
		
		Arrays.sort(arr);
		
		int cnt = 0;
		int mode = 0;
		
		for(int i = 0; i < 8001; i++) { 
			if(cnt < check[i]) { 
				cnt = check[i];
			}	
		}
		
		for(int i = 0; i < 8001; i++) {
			if(check[i] == cnt)
				list.add(i - 4000);
		}
		
		if(list.size() == 1)
			mode = list.get(0);
		else {
			mode = list.get(1);
		}
		
		sb.append(Math.round((double)sum / N)).append("\n");
		sb.append(arr[N / 2]).append("\n");
		sb.append(mode).append("\n");
		sb.append(arr[N - 1] - arr[0]);
		
		System.out.println(sb);
		
	}
}

