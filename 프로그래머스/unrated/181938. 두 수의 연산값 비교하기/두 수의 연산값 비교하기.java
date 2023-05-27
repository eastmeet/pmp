class Solution {
    public int solution(int a, int b) {
        String sumStr = String.valueOf(a) + String.valueOf(b);
        int sum = Integer.parseInt(sumStr);
        int multi = 2 * a * b;
        
        if (sum == multi) {
            return sum;
        }
        
        return (sum > multi)? sum : multi;
        
    }
}