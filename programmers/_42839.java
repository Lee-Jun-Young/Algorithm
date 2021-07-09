package programmers;

import java.util.HashSet;

public class _42839 {

	public static void main(String[] args) {
		String str = "011";
		System.out.println(solution(str));
	}

	public static int solution(String numbers) {
		HashSet<Integer> set = new HashSet<>();

		permutation("", numbers, set); 

		int cnt = 0;

		while (set.iterator().hasNext()) {
			int temp = set.iterator().next();
			if (isPrime(temp)) {
				cnt++;
			}
			set.remove(temp);
		}
		return cnt;
	}

	public static void permutation(String prefix, String str, HashSet<Integer> set) {
		int n = str.length();
		if (!prefix.equals("")) {
			set.add(Integer.valueOf(prefix));
		}

		for (int i = 0; i < n; i++) {
			permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n), set);
		}

	}

	public static boolean isPrime(int n) {
		if (n == 0 || n == 1)
			return false;
		for (int i = 2; i <= (int) Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

}