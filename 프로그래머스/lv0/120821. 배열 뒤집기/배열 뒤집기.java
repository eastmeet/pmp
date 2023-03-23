// import java.util.*는 코드 실행 불가 각각 import 명시 필요
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        List<Integer> list = Arrays.stream(num_list).boxed().collect(Collectors.toList());
        Collections.reverse(list);
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}