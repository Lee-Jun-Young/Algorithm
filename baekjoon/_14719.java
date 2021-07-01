package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _14719 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine(), " ");

		int H = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());

		int[] arr = new int[W];

		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < W; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int cnt = 0;
		for (int i = 0; i < W; i++) { // 현재 위치 기준 왼쪽과 오른쪽에서 가장 높은 높이를 구한다.(자신 포함)
			int left = i;
			for (int j = i; j >= 0; j--) {
				if (arr[j] > arr[left])
					left = j;
			}
			int right = i;
			for (int k = i; k < W; k++) {
				if (arr[k] > arr[right])
					right = k;
			}
			// 왼쪽과 오른쪽중의 작은 높이에서 내 높이를 빼준 것이 빗물이 고인 양이다.
			cnt += Math.min(arr[left], arr[right]) - arr[i];
		}

		System.out.println(cnt);
	}

}
