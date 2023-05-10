import java.lang.*;

class Solution {
    public int solution(int a, int b) {
        String x = String.valueOf(a) + String.valueOf(b);
        String y = String.valueOf(b) + String.valueOf(a);
        int x1 = Integer.parseInt(x);
        int y1 = Integer.parseInt(y);
        
        return Math.max(x1, y1);
    }
}