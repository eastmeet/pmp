import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) { 
        // queries
        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            int k = query[2];
            
            //i가 k의 배수인지 판단
            int start = s % k == 0 ? s : s + (k - s % k);
            for (int i = start; i <= e; i += k) {
                arr[i] += 1;
            }
        }
        return arr;
    }
}