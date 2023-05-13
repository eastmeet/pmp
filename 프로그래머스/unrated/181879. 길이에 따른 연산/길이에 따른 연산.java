import java.util.*;
class Solution {
    public int solution(int[] num_list) {
        int length = num_list.length;
        return length >=11 ? Arrays.stream(num_list).sum() : 
        Arrays.stream(num_list).reduce((a , b) -> (a * b)).getAsInt();
    }
}