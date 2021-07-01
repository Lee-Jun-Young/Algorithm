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
		for (int i = 0; i < W; i++) { // ���� ��ġ ���� ���ʰ� �����ʿ��� ���� ���� ���̸� ���Ѵ�.(�ڽ� ����)
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
			// ���ʰ� ���������� ���� ���̿��� �� ���̸� ���� ���� ������ ���� ���̴�.
			cnt += Math.min(arr[left], arr[right]) - arr[i];
		}

		System.out.println(cnt);
	}

}
