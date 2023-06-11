import java.util.Arrays;
class Solution {
    public int[] solution(int[] num_list) {
            int len = num_list.length;
            int[] arr = Arrays.copyOf(num_list, len + 1);
            int an = num_list[len - 1];
            int anm = num_list[len - 2];
            if (an > anm) {
                arr[len] = an - anm;
            } else {
                arr[len] = an * 2;
            }
            return arr;
    }
}