package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class _1764 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		ArrayList<String> list = new ArrayList<String>();

		st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		for (int i = 0; i < N + M; i++) {
			String temp = br.readLine();

			if (!map.containsKey(temp))
				map.put(temp, 1);
			else
				map.put(temp, map.get(temp) + 1);
		}

		for (String value : map.keySet()) {
			if (map.get(value) > 1) {
				list.add(value);
			}
		}

		Collections.sort(list);

		sb.append(list.size()).append("\n");

		for (String value : list)
			sb.append(value).append("\n");

		System.out.println(sb);
	}
}
