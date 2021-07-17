package programmers;

import java.util.HashSet;

public class _1845 {

	public static void main(String[] args) {

		int[] nums = { 3, 1, 2, 3 };

		System.out.println(solution(nums));
	}

	public static int solution(int[] nums) {
		int answer = 0;

		HashSet<Integer> set = new HashSet<Integer>();

		for (int value : nums) {
			set.add(value);
		}

		if (nums.length / 2 > set.size())
			answer = set.size();
		else
			answer = nums.length / 2;

		return answer;
	}

}
