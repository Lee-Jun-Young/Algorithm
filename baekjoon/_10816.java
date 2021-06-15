package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class _10816 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		int N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < N; i++) {
			int temp = Integer.parseInt(st.nextToken());

			if (map.get(temp) == null) {
				map.put(temp, 1);
				continue;
			}
			map.put(temp, map.get(temp) + 1);
		}

		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < M; i++) {
			int temp = Integer.parseInt(st.nextToken());

			if (map.get(temp) == null) {
				sb.append(0 + " ");
				continue;
			}
			sb.append(map.get(temp) + " ");
		}

		System.out.println(sb);
	}
}
