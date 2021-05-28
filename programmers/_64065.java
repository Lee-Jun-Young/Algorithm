package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class _64065 {
   public static void main(String[] args) {
      
       String str = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
   
       System.out.println(Arrays.toString(solution(str)));
      
   }
   
   public static int[] solution(String s) {
   
      ArrayList<Integer> list = new ArrayList<>();
      
        s = s.substring(2, s.length() - 1);
        String[] arr = s.split(",\\{");
        int[] answer = new int[arr.length];
        
        Arrays.sort(arr, (s1, s2) -> s1.length() - s2.length());
        
        for(int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].substring(0, arr[i].length()-1);
        }
        
        for(int i = 0; i < arr.length; i++){
            String[] str = arr[i].split(",");
            for(String ss : str){
                int num = Integer.parseInt(ss);
                if(!list.contains(num))
                    list.add(num);
            }
        }
        
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}