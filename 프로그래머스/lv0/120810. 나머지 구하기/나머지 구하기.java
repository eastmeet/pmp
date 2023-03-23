class Solution {
    public int solution(int num1, int num2) {
        boolean condition = (0 < num1 && num1 <= 100 && 0 < num2 && num2 <= 100);
        
        if (condition) {
            return num1 % num2;
        } else {
            return -1;
        }
    }
}