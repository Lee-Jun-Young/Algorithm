package programmers;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class _42628 {

	public static void main(String[] args) {
		String[] operations = {"I 7","I 5","I -5","D -1"};

		System.out.println(Arrays.toString(solution(operations)));
	}

	public static int[] solution(String[] operations) {
        int[] answer = {0,0};
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
        
        for(String operation : operations) {
        	String[] temp = operation.split(" ");
 	
        	if(temp[0].equals("I")) {
        		minHeap.add(Integer.parseInt(temp[1]));
        		maxHeap.add(Integer.parseInt(temp[1]));
        	}
        	
        	if(temp[0].equals("D")) {
        		if(!minHeap.isEmpty()) {
        			if(Integer.parseInt(temp[1]) > 0) {
        				int max = maxHeap.peek();
        				minHeap.remove(max);
        				maxHeap.remove(max);
        			}
        			else {
        				int min = minHeap.peek();
        				minHeap.remove(min);
        				maxHeap.remove(min);
        			}
        		}	
        	}
        }

        if(!minHeap.isEmpty()) {
        	answer[0] = maxHeap.poll();
        	answer[1] = minHeap.poll();
        }

        return answer;
    }
}
