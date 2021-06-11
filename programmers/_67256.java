package programmers;

public class _67256 {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,8,2,1,4,5,9,5};
		
		String hand = "right";
		
		System.out.println(solution(numbers, hand));

	}
	
	public static String solution(int[] numbers, String hand) {
		String answer = "";
		int leftHandLocation = 10;
		int rightHandLocation = 12;
		
		for(int value : numbers){
            if(value == 1 || value == 4 || value == 7) {
                answer += "L";
                leftHandLocation = value;
            }
            else if (value == 3 || value == 6 || value == 9) {
                answer += "R";
                rightHandLocation = value;
            }
            else {
            	int leftLength = checkLength(leftHandLocation, value);
            	int rigthLength = checkLength(rightHandLocation, value);
            	
            	if(leftLength > rigthLength) {
            		answer += "R";
            		rightHandLocation = value;
            	}else if(leftLength < rigthLength) {
            		answer += "L";
            		leftHandLocation = value;
            	}else {
            		if(hand.equals("right")) {
            			answer += "R";
                		rightHandLocation = value;
            		}else {
            			answer += "L";
                		leftHandLocation = value;
            		}		
            	}
            }
        }	
		return answer;
	}
	
	public static int checkLength(int current, int number) {
		
		if(current == 0)
			current = 11;
		if(number == 0)
			number = 11;

		return Math.abs((current - 1) / 3 - (number / 3)) + Math.abs((current - 1) % 3 - 1);
	}

}
