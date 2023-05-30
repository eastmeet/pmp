class Solution {
    public int solution(int a, int d, boolean[] included) {
        // a0 = a, d 
        // 쉬운 방법 boolena[] incldued 만큼 공차를 더 한 새로운 int[] 배열 생성
        // 그 배열에 맞춰 값 더하고 최종 리턴
        // 더 좋은 방법은 없을까?
        // 일반식 an = a + n*d 아님?
        // a0 = a, a1 = a + 1*d
        int sum = 0;
        for (int i = 0; i < included.length; i++) {
             if (included[i] == true) {
                 sum += (a + i*d);
             }
        }
        return sum;
        
    }
}