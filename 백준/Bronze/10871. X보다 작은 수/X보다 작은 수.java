import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Main {
    private static final Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        int n = kb.nextInt();
        int x = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        int[] result = solution(arr, x);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }

    public static int[] solution(int[] arr, int num) {
        ArrayList<Integer> result = new ArrayList();
        for (int a: arr) {
            if (a < num) {
                result.add(a);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}