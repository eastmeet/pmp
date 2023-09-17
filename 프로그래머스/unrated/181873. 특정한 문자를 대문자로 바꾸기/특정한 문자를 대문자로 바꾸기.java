class Solution {
    public String solution(String my_string, String alp) {
        String result = "";
        
        for (char c : my_string.toCharArray()) {
            if (c == alp.charAt(0)) {
                c = Character.toUpperCase(c);
            }
            result += c;
            
        }
        
        return result;
    }
}