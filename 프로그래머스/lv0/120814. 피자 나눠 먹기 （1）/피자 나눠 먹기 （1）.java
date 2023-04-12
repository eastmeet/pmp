import java.lang.Math.*;
class Solution {
    public int solution(int n) {
        if (n <= 7) {
            return 1;
        }
        
        // 필요 피자수 = n / 7
        return (int) Math.ceil(n / 7.0);
        

    }
}