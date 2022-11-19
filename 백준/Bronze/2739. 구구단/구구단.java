import java.util.*;
public class Main {
    public static final Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        int N = kb.nextInt();
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d * %d = %d%n",N , i, (N * i));
        }
    }
}