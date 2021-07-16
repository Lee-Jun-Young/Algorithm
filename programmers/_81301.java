package programmers;

public class _81301 {

	public static void main(String[] args) {
		String s = "one4seveneight";

		System.out.println(solution(s));

	}

	public static int solution(String s) {
		int answer = 0;

		String[] arr = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

		for (int i = 0; i < 10; i++) {
			s = s.replaceAll(arr[i], Integer.toString(i));
		}

		answer = Integer.parseInt(s);

		return answer;
	}

}
