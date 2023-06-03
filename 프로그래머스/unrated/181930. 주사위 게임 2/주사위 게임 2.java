class Solution {
    public int solution(int a, int b, int c) {
        int i = checkEqual(a, b, c);
        int x = 1;
        while(i >= 1) {
            x *= eq(a, b, c, i);
            i--;
        }
        return x;
    }
        
    private int checkEqual(int a, int b, int c) {
        if (a != b && b != c && c != a){
            return 1;
        } else if (a == b && b== c) {
            return 3;
        } else {
            return 2;
        }
    }
        
    private int eq(int a, int b, int c, int i) {
        return (int)Math.pow(a, i) + (int)Math.pow(b, i) + (int)Math.pow(c, i);
    }
}