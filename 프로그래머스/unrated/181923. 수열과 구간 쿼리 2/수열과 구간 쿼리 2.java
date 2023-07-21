import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
       int[] result = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];

            result[i] = IntStream.rangeClosed(s, e)
                                 .map(index -> arr[index])
                                 .filter(value -> value > k)
                                 .min()
                                 .orElse(-1);
        }
        
        return result;
    }
}