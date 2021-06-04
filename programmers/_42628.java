package programmers;

import java.util.Arrays;
import java.util.PriorityQueue;

public class _42628 {

	public static void main(String[] args) {
		String[] operations = {"I 7","I 5","I -5","D -1"};

		System.out.println(Arrays.toString(solution(operations)));
	}

	public static int[] solution(String[] operations) {
        int[] answer = new int[2];
        
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
        int max = 0;
        int min = 0;
        
        for(String operation : operations) {
        	String[] temp = operation.split(" ");
        	max = Math.max(max, Integer.parseInt(temp[1]));
        	min = Math.min(min, Integer.parseInt(temp[1]));
        	
        	if(temp[0].equals("I")) {
        		heap.add(Integer.parseInt(temp[1]));
        	}
        	
        	if(temp[0].equals("D")) {
        		if(!heap.isEmpty()) {
        			if(Integer.parseInt(temp[1]) > 0)
        				heap.remove(max);
        			else
        				heap.remove(min);
        		}	
        	}
        }

        if(heap.isEmpty()) {
        	answer[0] = 0;
        	answer[1] = 0;
        }
        else {
        	answer[1] = heap.poll();
            int idx = heap.size();
            
            if(idx == 1)
            	answer[0] = heap.poll();
            else {
            	while(idx > 1) {
                	heap.poll();     	
                }
            	answer[0] = heap.poll();
            }
        }

        return answer;
    }
}
