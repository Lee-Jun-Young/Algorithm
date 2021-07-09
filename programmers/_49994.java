package programmers;

import java.util.HashSet;

public class _49994 {

	public static void main(String[] args) {

		String dirs = "LULLLLLLU";
		System.out.println(solution(dirs));

	}

	public static int solution(String dirs) {
		int answer = 0;
		HashSet<String> set = new HashSet<String>();

		int x_location = 0;
		int y_location = 0;

		for (int i = 0; i < dirs.length(); i++) {
			char temp = dirs.charAt(i);
			String str = x_location + " " + y_location;

			switch (temp) {

			case 'U':
				if (y_location != 5) {
					y_location += 1;
					set.add(str + " " + x_location + " " + y_location);
					set.add(x_location + " " + y_location + " " + str);
					break;
				}
			case 'D':
				if (y_location != -5) {
					y_location -= 1;
					set.add(str + " " + x_location + " " + y_location);
					set.add(x_location + " " + y_location + " " + str);
					break;
				}
			case 'R':
				if (x_location != 5) {
					x_location += 1;
					set.add(str + " " + x_location + " " + y_location);
					set.add(x_location + " " + y_location + " " + str);
					break;
				}
			case 'L':
				if (x_location != -5) {
					x_location -= 1;
					set.add(str + " " + x_location + " " + y_location);
					set.add(x_location + " " + y_location + " " + str);
					break;
				}
			}
		}

		answer += set.size() / 2;

		return answer;
	}
}