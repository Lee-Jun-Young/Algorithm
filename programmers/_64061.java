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
					// ������ ��� ���� �ʰ� ������ �����ϴ� ������ ���� ������ ���� ���ٸ� ���� ��� ���� �� ���� ���ش�.
					if(!stack.isEmpty() && stack.peek() == board[j][moves[i]-1]) {	
						stack.pop();
						answer += 2;
					}else {
						// ������ ����ְų� ���� �ٸ� �����̶�� ������ �߰����ش�.
						stack.push(board[j][moves[i]-1]);	
					}
					// ������ ���� �ڸ��� 0���� ������ش�.
					board[j][moves[i]-1] = 0;	
					break;
				}
			}
		}	
		return answer;
	}
}
