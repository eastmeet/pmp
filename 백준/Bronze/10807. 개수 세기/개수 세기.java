import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Main {
    private static final Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        int findNumber = kb.nextInt();

        System.out.println(solution(arr, findNumber));
    }

    public static int solution(int[] arr, int num) {
        int count = 0;
        for (int i : arr) {
            if (i == num) {
                count++;
            }
        }
        return count;
    }
}