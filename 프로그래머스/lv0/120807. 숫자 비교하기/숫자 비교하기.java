class Solution {
    public int solution(int num1, int num2) {
        boolean condition = (0 <= num1 && num1 <= 10_000 && 0 <= num2 && num2 <= 10_000);
        
        if (!condition || num1 != num2) {
            return -1;
        } else {
            return 1;
        }
    }
}