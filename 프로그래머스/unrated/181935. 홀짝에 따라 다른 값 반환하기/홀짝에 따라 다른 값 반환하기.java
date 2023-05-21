class Solution {
    public int solution(int n) {
        int sum = 0;
        if (n % 2 == 0) {
            // n이하 짝수 모든 양의 정수 제곱의 합 리턴
            for (int i = 0; i <= n; i = i+2) {
                sum += i * i;
            }
            return sum;
        } else {
            // 모든 양의 정수의 합 리턴 n이하 홀수
                for (int i = 1; i <= n; i = i+2) {
                sum += i;
            }
            return sum;
        }
    }
}