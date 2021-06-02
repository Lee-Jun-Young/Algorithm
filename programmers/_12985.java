package programmers;

public class _12985 {

	public static void main(String[] args) {
		
		int N = 8;
		int A = 4;
		int B = 7;
		
		System.out.println(solution(N,A,B));
	}

	public static int solution(int n, int a, int b) {
		int answer = 0;
		
		while(a != b) {
			a = (a+1) / 2;
			b = (b+1) / 2;
			answer++;
		}
		
		return answer;
	}
}
