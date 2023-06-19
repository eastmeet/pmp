class Solution {
    public int solution(String myString, String pat) {
        String src = myString.toLowerCase();
        String des = pat.toLowerCase();
        
        return src.contains(des) ? 1 : 0;
    }
}