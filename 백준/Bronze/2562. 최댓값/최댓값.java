import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Main {
    private static final Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            arrayList.add(kb.nextInt());
        }

        int max = arrayList.stream().mapToInt(Integer::intValue).max().getAsInt();
        int index = arrayList.indexOf(max) + 1;
        System.out.println(max);
        System.out.println(index);
    }
}