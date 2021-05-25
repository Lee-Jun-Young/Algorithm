package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class _18258 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		LinkedList<Integer> queue = new LinkedList<>();
		
		int num = 0;
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            
            String type = st.nextToken();
        	if(type.equals("push")) {
        		num = Integer.parseInt(st.nextToken());
        		queue.add(num);
        	}else if(type.equals("front")){
        		sb.append(queue.isEmpty()?-1:queue.peek()).append("\n");
        	}else if(type.equals("back")) {
        		sb.append(queue.isEmpty()?-1:num).append("\n");
        	}else if(type.equals("size")) {
        		sb.append(queue.size()).append("\n");
        	}else if(type.equals("pop")) {
        		sb.append(queue.isEmpty()?-1:queue.poll()).append("\n");
        	}else if(type.equals("empty")) {
        		sb.append(queue.isEmpty()?1:0).append("\n");
        	}
        }
		
		System.out.println(sb);
    }
}