package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class _1655 {

public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringBuilder sb = new StringBuilder();
	
	PriorityQueue<Integer> maxQueue = new PriorityQueue<Integer>(Comparator.reverseOrder());
	PriorityQueue<Integer> minQueue = new PriorityQueue<Integer>();
	
	int N = Integer.parseInt(br.readLine());
	
	for(int i = 0; i < N; i++) {
		int temp = Integer.parseInt(br.readLine());
		
		if(maxQueue.size() == minQueue.size()) {
			maxQueue.add(temp);
		}else {
			minQueue.add(temp);
		}
		
		if(!maxQueue.isEmpty() && !minQueue.isEmpty()) {
			if(maxQueue.peek() > minQueue.peek()) {
				minQueue.add(maxQueue.poll());
				maxQueue.add(minQueue.poll());
			}
		}
		sb.append(maxQueue.peek()).append("\n");
	}
	System.out.println(sb);
	}
}

