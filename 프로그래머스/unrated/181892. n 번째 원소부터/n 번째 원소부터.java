import java.util.*;
import java.lang.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        // 번째 n 인덱스는 n - 1 로 생각할 것
        return Arrays.copyOfRange(num_list, n - 1, num_list.length);
    }
}