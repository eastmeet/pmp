class Solution {
    public static final int MEAL_PRICE = 12000;
    public static final int DRINK = 2000;
    
    public int solution(int n, int k) {
        return MEAL_PRICE * n + DRINK * (k - n/10);
    }
}