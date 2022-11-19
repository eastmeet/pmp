import java.util.*;

public class Main {
    public static final Scanner kb = new Scanner(System.in);

    public static int max(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (a > b && a < c) {
            return c;
        } else {
            return Math.max(b, c);
        }
    }

    public static void main(String[] args) {
        int first = kb.nextInt();
        int second = kb.nextInt();
        int last = kb.nextInt();
        int reward = 0;
        if (first == second && second == last) {
            reward = 10_000 + first * 1_000;
        } else if (first != second && second != last && first != last) {
            reward = max(first, second, last) * 100;
        } else if (first == second) {
            reward = 1_000 + first * 100;
        } else {
            reward = 1_000 + last * 100;
        }
        System.out.println(reward);
    }
}