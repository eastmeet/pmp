class Solution {
    public int solution(int number, int n, int m) {
        // number가 n의 배수이면서 m의 배수라면 1
        if (number % n == 0 && number % m == 0) {
            return 1;
        } else {
            return 0;
        }
        

    }
}