package programmers;

import java.util.ArrayList;

public class _17680 {

	public static void main(String[] args) {
		int cacheSize = 3;
		String[] cities = { "Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA" };

		System.out.println(solution(cacheSize, cities));
	}

	public static int solution(int cacheSize, String[] cities) {
		int answer = 0;

		ArrayList<String> cache = new ArrayList<String>();

		// cacheSize가 0인 경우
		if (cacheSize == 0) {
			answer = cities.length * 5;
			return answer;
		}

		for (String city : cities) {
			String temp = city.toLowerCase();

			// cache hit
			if (cache.contains(temp)) {
				answer += 1;

				cache.remove(temp);
				cache.add(temp);
			} else {	// cache miss
				answer += 5;

				if (cache.size() == cacheSize)
					cache.remove(0);

				cache.add(temp);
			}
		}
		return answer;
	}
}
