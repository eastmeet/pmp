import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Main {
    private static final Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {

        int N = kb.nextInt();
        int[] result = new int[N];
        for (int i = 0; i < N; i++) {
            result[i] = kb.nextInt();
        }
        int min = Arrays.stream(result).min().getAsInt();
        int max = Arrays.stream(result).max().getAsInt();
        System.out.println(min + " " + max);
    }
}