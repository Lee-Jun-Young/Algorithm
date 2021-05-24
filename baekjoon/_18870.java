package baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class _18870 {
	public static void main(String[] args) throws IOException {	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];
        int arrClone[] = new int[N];
        
        st = new StringTokenizer(br.readLine()," ");
        	
        for(int i = 0; i < arr.length; i++) {
        	int temp = Integer.parseInt(st.nextToken());
        	arr[i] = temp;
        	arrClone[i] = temp;
        }
        
        Arrays.sort(arrClone);

        Map<Integer,Integer> map = new HashMap<>();
        int cnt = 0;
        
        for(int i = 0; i < arrClone.length; i++) {
        	if(!map.containsKey(arrClone[i])) {
        		map.put(arrClone[i], cnt++);
        	}
        }
	
        for(int i = 0; i < arr.length; i++){
        	sb.append(map.get(arr[i]) + " ");
        }
        
        System.out.println(sb);
	}
}


