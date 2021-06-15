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
			map.put(i, Integer.parseInt(st.nextToken()));
		}

		int M = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < M; i++) {
			int cnt = 0;
			int temp = Integer.parseInt(st.nextToken());

			for (int j = 0; j < map.size(); j++) {
				if (map.get(j) == temp)
					cnt++;
			}
			sb.append(cnt + " ");
		}
		System.out.println(sb);
	}
}
