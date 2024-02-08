import java.util.*;

class Solution {
    public int solution(int[] sides) {
    
        int[] sortedSides = Arrays.stream(sides).sorted().toArray();
    
        if (sortedSides[0] + sortedSides[1] > sortedSides[2]) {
            return 1;
        }
        
        return 2;
    }
}