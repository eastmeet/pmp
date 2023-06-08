class Solution {
    public String solution(String my_string, int[] index_list) {
        String result = "";
        for (int i : index_list) {
            char[] c = my_string.toCharArray();
            result += c[i];
        }
        
        return result;        
    }
}