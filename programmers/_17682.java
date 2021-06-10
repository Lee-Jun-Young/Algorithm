package programmers;

public class _17682 {

	public static void main(String[] args) {
		String str = "1S2D*3T";
		
		int[] result = new int[3];
		char[] arr = str.toCharArray();
		int answer = 0;
		int idx = -1;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] >= '0' && arr[i] <= '9') {	// 숫자
				idx++;
				if(arr[i] == '1' && arr[i+1] == '0') {	// 점수가 10점인지 확인
					result[idx] = 10;
					i++;
				}else {
					result[idx] = arr[i] - '0';
				}
			}else if(arr[i] == 'D') {	// 보너스가 D인 경우 2제곱
				result[idx] = (int) Math.pow(result[idx], 2);
			}else if(arr[i] == 'T') {	// 보너스가 T인 경우 3제곱, S은 1제곱이기 떄문에 작성X
				result[idx] = (int) Math.pow(result[idx], 3);
			}else if(arr[i] == '*') {	// 옵션이 *인 경우 
				if(idx > 0) {			
					result[idx - 1] *= 2;	// 이전점수가 있다면 이전 점수와 해당 점수 모두 2배
				}
				result[idx] *= 2;
			}else if(arr[i] == '#') {
				result[idx] *= -1;			// 옵션이 #인 경우 해당 점수 마이너스
			}
		}
		
		for(int value : result) {
			answer += value;
		}
		System.out.println(answer);
	}
}
