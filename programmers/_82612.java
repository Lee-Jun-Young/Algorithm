package programmers;

public class _82612 {

	public static void main(String[] args) {
		int price = 3;
		int money = 20;
		int count = 4;

		System.out.println(solution(price, money, count));

	}

	public static long solution(int price, int money, int count) {

		long total_price = 0;

		for (int i = 1; i <= count; i++) {
			total_price += price * i;
		}

		return (money > total_price) ? 0 : total_price - money;
	}

}
