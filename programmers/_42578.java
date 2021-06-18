package programmers;

import java.util.HashMap;

public class _42578 {

	public static void main(String[] args) {
		String[][] arr = { { "yellowhat", "headgear" }, { "bluesunglasses", "eyewear" },
				{ "green_turban", "headgear" } };

		System.out.println(solution(arr));
	}

	public static int solution(String[][] clothes) {
		int answer = 1;

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < clothes.length; i++) {
			String temp = clothes[i][1];
			if (!map.containsKey(temp))
				map.put(temp, 1);
			else
				map.put(temp, map.get(temp) + 1);
		}

		for (String key : map.keySet()) {
			answer *= map.get(key) + 1;
		}

		return answer - 1;
	}
}
