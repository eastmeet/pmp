class Solution {
    public int[] solution(int n, int k) {
        int length = n / k;
        int[] arr = new int[length];
        int i = 1;
        
        while(k * i <= n) {
            arr[i - 1] = k * i;
            i++;
        }
           
        return arr;
        
    }
}