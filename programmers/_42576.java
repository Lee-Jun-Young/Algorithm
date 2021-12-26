package programmers;

import java.util.HashMap;

public class _42576 {

	public static void main(String[] args) {

		String[] participant = { "leo", "kiki", "eden" };
		String[] completion = { "eden", "kiki" };
		System.out.println(solution(participant, completion));
	}

	public static String solution(String[] participant, String[] completion) {
		String answer = "";

		HashMap<String, Integer> hashMap = new HashMap<>();

		for (String temp : participant) {
			if (hashMap.containsKey(temp)) {
				hashMap.put(temp, hashMap.get(temp) + 1);
			} else {
				hashMap.put(temp, 1);
			}
		}

		for (String temp : completion)
			hashMap.put(temp, hashMap.get(temp) - 1);

		for (String temp : hashMap.keySet()) {
			if (hashMap.get(temp) != 0) {
				answer += temp;
			}
		}

		return answer;
	}
}
