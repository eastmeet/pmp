import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Main {
    private static final Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> result = new ArrayList();
        int N = kb.nextInt();

        for (int i = 0; i < N; i++) {
            result.add(kb.nextInt());
        }
        System.out.print(result.stream().mapToInt(Integer::intValue).min().getAsInt());
        System.out.print(" ");
        System.out.print(result.stream().mapToInt(Integer::intValue).max().getAsInt());

    }

}