class Solution {
    public String solution(String my_string, String alp) {    
        String x = alp.toUpperCase();
        return my_string.replaceAll(alp, x);
    

    }
}