import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static int[] solution(int l, int r) {
        List<Integer> validNumbers = new ArrayList<>();
        // 5부터 시작하여 r 이하까지 "0"과 "5"로만 이루어진 숫자를 검사합니다.
        for (int num = 5; num <= r; num += 5) {
            if (isValid(num) && num >= l) {
                validNumbers.add(num);
            }
        }

        // 조건에 맞는 숫자가 없으면 -1을 반환합니다.
        if (validNumbers.isEmpty()) {
            return new int[]{-1};
        }
        // 결과를 배열로 변환하여 반환합니다.
        return validNumbers.stream().mapToInt(i -> i).sorted().toArray();
    }

    // 숫자가 "0"과 "5"로만 이루어져 있는지 검사하는 함수
    private static boolean isValid(int num) {
        while (num > 0) {
            int digit = num % 10;
            if (digit != 0 && digit != 5) {
                return false;
            }
            num /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        int l = 1;
        int r = 1000000;
        int[] result = solution(l, r);
        for (int num : result) {
            System.out.println(num);
        }
    }
}
