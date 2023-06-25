import java.io.*;
import java.math.BigInteger;


public class Main {

    public static void main(String[] args) {
        try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))) {
            String[] str = bf.readLine().split(" ");
            BigInteger a = new BigInteger(str[0]);
            BigInteger b = new BigInteger(str[1]);

            if (!b.equals(BigInteger.ZERO)) {
                BigInteger c = a.divide(b);
                BigInteger d = a.mod(b);
                System.out.println(c);
                System.out.println(d);
            } else {
                System.out.println("0으로 나눌 수 없습니다.");
            }
        } catch (IOException e) {
            System.out.println("입력 오류: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("잘못된 입력 형식입니다.");
        }
    }
}
