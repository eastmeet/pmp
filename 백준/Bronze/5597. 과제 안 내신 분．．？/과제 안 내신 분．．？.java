import java.util.*;
import java.util.stream.Collectors;

public class Main {
    private static final Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {

        // 30명 학생 1~30번 출석번호
        // 28명 특별과제 제출
        // 그럼 2명의 출석번호는?
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        int N = 28;
        for (int i = 1; i <= N; i++) {
            map.put(kb.nextInt(), i);
        }
//        System.out.println(map);
//
//        System.out.println(map.size());
        for (int i = 1; i <= 30; i++) {
            if (map.get(i) == null) {
                result.add(i);
            }
        }
        List<Integer> collect = result.stream().sorted().collect(Collectors.toList());
        for (int i = 0; i < collect.size(); i++) {
            System.out.println(collect.get(i));
        }

    }
}
