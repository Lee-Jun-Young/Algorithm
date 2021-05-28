package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _13305 {
   public static void main(String[] args) throws IOException {   
         
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine());
        
        int[] distanceArr = new int[N-1];
        int[] priceArr = new int[N];
        
        st = new StringTokenizer(br.readLine()," ");
        for(int i = 0; i < N-1; i++) {
          distanceArr[i] = Integer.valueOf(st.nextToken());
       }

       st = new StringTokenizer(br.readLine()," ");
       for(int i = 0; i < N; i++) {
          priceArr[i] = Integer.valueOf(st.nextToken());
       } 
        
        long result = 0;
        long temp = priceArr[0];
        
        for(int i = 0; i < N - 1; i++) {
           if(temp >= priceArr[i]) {
              temp = priceArr[i];
           }
           result += distanceArr[i] * temp;
        }
        
        System.out.println(result);
   }
}
