class Solution {
    public String solution(String my_string, int n) {
        int length = my_string.length() - n;
        return my_string.substring(length);
        
    }
}