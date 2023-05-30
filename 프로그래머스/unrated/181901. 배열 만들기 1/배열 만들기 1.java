class Solution {
    public int[] solution(int n, int k) {
        int length = n / k;
        int[] arr = new int[length];
        int i = 0;
        
        while(k * (i + 1) <= n) {
            arr[i] = k * (i + 1);
            i++;
        }
           
        return arr;
        
    }
}