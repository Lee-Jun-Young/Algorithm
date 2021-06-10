package programmers;

import java.util.Stack;

public class _64061 {

	public static void main(String[] args) {
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		
		System.out.println(solution(board,moves));
	}
	
	public static int solution(int[][] board, int[] moves) {
		int answer = 0;
		
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i = 0; i < moves.length; i++) {
			for(int j = 0; j < board.length; j++) {
				if(board[j][moves[i]-1] != 0) {
					// 스택이 비어 있지 않고 스택의 존재하던 인형과 들어온 인형이 서로 같다면 같은 모양 인형 두 개를 없앤다.
					if(!stack.isEmpty() && stack.peek() == board[j][moves[i]-1]) {	
						stack.pop();
						answer += 2;
					}else {
						// 스택이 비어있거나 서로 다른 인형이라면 인형을 추가해준다.
						stack.push(board[j][moves[i]-1]);	
					}
					// 인형이 나간 자리는 0으로 만들어준다.
					board[j][moves[i]-1] = 0;	
					break;
				}
			}
		}	
		return answer;
	}
}
