import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // input 최대 길이 6글자, 0~9와 A~F로 이루어짐, A~F는 10~15
        String a = br.readLine();
        int length = a.length();
        long result = 0;
        for (int i = 0; i < length; i++) {
            char[] c = a.toCharArray();
            switch (c[i]) {
                case 'A':
                    result += 10 * Math.pow(16, length - i - 1);
                    break;
                case 'B':
                    result += 11 * Math.pow(16, length - i - 1);
                    break;
                case 'C':
                    result += 12 * Math.pow(16, length - i - 1);
                    break;
                case 'D':
                    result += 13 * Math.pow(16, length - i - 1);
                    break;
                case 'E':
                    result += 14 * Math.pow(16, length - i - 1);
                    break;
                case 'F':
                    result += 15 * Math.pow(16, length - i - 1);
                    break;
                default:
                    result += Long.parseLong(String.valueOf(c[i])) * Math.pow(16, length - i - 1);
            }
        }
        System.out.println(result);
    }
}
