package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _11004 {
	public static void main(String[] args) throws IOException {	
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		
		int N  = Integer.parseInt(st.nextToken());
		int num  = Integer.parseInt(st.nextToken());
		
		long arr[] = new long[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		quickSort(arr,0,N-1);
		
		System.out.println(arr[num-1]);
	}
	
	// Äü ¼ÒÆ®
	public static void quickSort(long[] arr, int left, int right) {
		int i, j, pivot, temp;
		
		if(left < right) {
			i = left;
			j = right;
			pivot = (int) arr[left];
			
			while(i < j) {
				while(arr[j] > pivot) j--;
				
				while(i < j && arr[i] <= pivot) i++;
				
				temp = (int) arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			arr[left] = arr[i];
			arr[i] = pivot;
			
			quickSort(arr,left,i-1);
			quickSort(arr,i+1,right);
		}
	}
}
