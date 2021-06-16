package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class _42888 {

	public static void main(String[] args) {
		String[] arr = { "Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo",
				"Change uid4567 Ryan" };

		System.out.println(Arrays.toString(solution(arr)));
	}

	public static String[] solution(String[] record) {
		ArrayList<String> list = new ArrayList<String>();
		HashMap<String, String> map = new HashMap<>();

		for (String str : record) {
			String[] temp = str.split(" ");

			if (!temp[0].equals("Leave"))
				map.put(temp[1], temp[2]);
		}

		for (String str : record) {
			String[] temp = str.split(" ");

			String type = temp[0];

			if (type.equals("Enter"))
				list.add(map.get(temp[1]) + "님이 들어왔습니다.");
			else if (type.equals("Leave"))
				list.add(map.get(temp[1]) + "님이 나갔습니다.");
		}

		String[] answer = new String[list.size()];

		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}

		return answer;
	}
}