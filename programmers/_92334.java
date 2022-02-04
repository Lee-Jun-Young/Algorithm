package programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class _92334 {
	public static StringTokenizer st;

	public static void main(String[] args) {

		String[] id_list = { "muzi", "frodo", "apeach", "neo" };
		String[] report = { "muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi" };
		int k = 2;

		System.out.println(Arrays.toString(solution(id_list, report, k)));
	}

	public static int[] solution(String[] id_list, String[] report, int k) {
		int[] answer = new int[id_list.length];

		HashMap<String, Set<String>> reportMap = new HashMap<>();
		HashMap<String, Integer> resultMap = new HashMap<>();

		for (int i = 0; i < id_list.length; i++) {
			Set<String> temp = new HashSet<String>();
			resultMap.put(id_list[i], 0);
			reportMap.put(id_list[i], temp);
		}

		for (String temp : report) {
			st = new StringTokenizer(temp);
			String reporter = st.nextToken();
			String respondent = st.nextToken();
			if (reportMap.get(reporter).add(respondent)) {
				resultMap.put(respondent, resultMap.get(respondent) + 1);
			}
		}

		for (String temp : report) {
			st = new StringTokenizer(temp);
			String reporter = st.nextToken();
			String sec = st.nextToken();
			if (resultMap.get(sec) < k) {
				reportMap.get(reporter).remove(sec);
			}
		}

		for (int i = 0; i < answer.length; i++) {
			answer[i] = reportMap.get(id_list[i]).size();
		}

		return answer;
	}

}
