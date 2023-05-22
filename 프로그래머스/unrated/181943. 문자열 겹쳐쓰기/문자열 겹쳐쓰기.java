class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
            String prefix = my_string.substring(0, s);
            String postfix = my_string.substring(overwrite_string.length() + s);
        
            return prefix + overwrite_string + postfix;
        
    }
}