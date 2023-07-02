class Solution {
    public int solution(String number) {
        try {
            return Integer.parseInt(number) % 9;
        } catch (NumberFormatException e) {
            int sum = 0;
            for (char c : number.toCharArray()) {
                sum += Character.getNumericValue(c);
            }
            return sum % 9;
        }
    }
        
        
}
    
