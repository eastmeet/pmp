class Solution {
    public String solution(String my_string, String alp) {
        
        String x = alp.toUpperCase();
        my_string = my_string.replaceAll(alp, x);
        
        return my_string;
    }
}