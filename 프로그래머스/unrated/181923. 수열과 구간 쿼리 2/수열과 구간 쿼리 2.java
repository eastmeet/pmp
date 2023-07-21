import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        List<Integer> result = new ArrayList<>();
        // queries에서 querie를 하나 뽑는다.
        for (int[] query : queries) {
            // arr length에 맞춰 for문을 돌린다.    
            int s = query[0];
            int e = query[1];
            int k = query[2];
            
            // arr 짜르기
            int[] arrSlice = Arrays.copyOfRange(arr, s, e + 1);
            
            // 원소비교 및 최소값
            int min = Arrays.stream(arrSlice).filter(x -> x > k).min().orElse(-1);
            result.add(min);
        }
        
        return result.stream().mapToInt(x->x).toArray();
    }
    
}