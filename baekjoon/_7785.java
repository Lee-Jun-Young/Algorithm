package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class _7785 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());

		HashSet<String> set = new HashSet<String>();

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			String name = st.nextToken();
			String type = st.nextToken();

			if (type.equals("enter"))
				set.add(name);
			else {
				set.remove(name);
			}
		}

		ArrayList<String> list = new ArrayList<>(set);
		list.sort(Collections.reverseOrder());
		for (String value : list) {
			sb.append(value).append("\n");
		}

		System.out.println(sb);

	}

}
