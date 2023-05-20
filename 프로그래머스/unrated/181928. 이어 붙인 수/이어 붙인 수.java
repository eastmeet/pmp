import java.util.*;
import java.lang.*;
class Solution {
    public int solution(int[] num_list) {
        String oddSum ="";
        String evenSum = "";
        for (int num : num_list) {
            if (num % 2 == 0) {
                evenSum += String.valueOf(num);
            } else {
                oddSum += String.valueOf(num);
            }
        }
        return Integer.parseInt(oddSum) + Integer.parseInt(evenSum);
    }
}