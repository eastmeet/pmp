import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        List<Integer> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        // queries에서 querie를 하나 뽑는다.
        for (int[] query : queries) {
            // arr length에 맞춰 for문을 돌린다.    
            int s = query[0];
            int e = query[1];
            int k = query[2];
            
            // arr 짜르기
            int[] arrSlice = Arrays.copyOfRange(arr, s, e + 1);
            
            // 원소비교
            // 1. arrSlice[] > k
            for (int x : arrSlice) {
                if (x > k) {
                    list.add(x);
                }
            }
             
            int min = list.stream().mapToInt(x->x).min().orElse(-1);
            result.add(min);
            list.clear();
        }
        
        return result.stream().mapToInt(x->x).toArray();
    }
    
}