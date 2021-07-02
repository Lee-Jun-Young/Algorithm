package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class _9375 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			int n = Integer.parseInt(br.readLine());

			for (int j = 0; j < n; j++) {
				st = new StringTokenizer(br.readLine(), " ");
				st.nextToken();
				String type = st.nextToken();
				if (map.containsKey(type))
					map.put(type, map.get(type) + 1);
				else
					map.put(type, 1);
			}

			int result = 1;
			for (int value : map.values()) {
				result *= value + 1;
			}

			System.out.println(result - 1);
		}
	}
}