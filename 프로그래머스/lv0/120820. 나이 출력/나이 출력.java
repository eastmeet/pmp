class Solution {
    public int solution(int age) {
        boolean condition = (age > 0 && age <= 120);
     
        if (condition) {
            return calcBirthYear(age);
        }
        
        return -1;
    }
    
    private int calcBirthYear(int age) { 
        return 2022 - age + 1;
    }
    
}