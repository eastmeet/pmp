import java.io.*;

public class Main {

    private static final int BASE_16 = 16;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            // input 최대 길이 6글자, 0~9와 A~F로 이루어짐, A~F는 10~15
            String input = br.readLine().toUpperCase();
            char[] inputArr = input.toCharArray();
            int length = inputArr.length;
            long[] powersOf16 = getPowersOf16(length);
            long result = 0;
            for (int i = 0; i < length; i++) {
                switch (inputArr[i]) {
                    case 'A':
                        result += calculateResult(10, powersOf16, i);
                        break;
                    case 'B':
                        result += calculateResult(11, powersOf16, i);
                        break;
                    case 'C':
                        result += calculateResult(12, powersOf16, i);
                        break;
                    case 'D':
                        result += calculateResult(13, powersOf16, i);
                        break;
                    case 'E':
                        result += calculateResult(14, powersOf16, i);
                        break;
                    case 'F':
                        result += calculateResult(15, powersOf16, i);
                        break;
                    default:
                        if (inputArr[i] >= '0' && inputArr[i] <= '9') {
                            result += calculateResult(inputArr[i] - '0', powersOf16, i);
                        } else {
                            throw new IllegalArgumentException("Invalid Hexadecimal input");
                        }
                }
            }
            bw.write(String.valueOf(result));
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static long calculateResult(int value, long[] powersOf16, int i) {
        return value * powersOf16[i];
    }

    private static long[] getPowersOf16(int length) {
        long[] powersOf16 = new long[length];
        for (int i = 0; i < length; i++) {
            powersOf16[i] = (long) Math.pow(BASE_16, length - i - 1);
        }
        return powersOf16;
    }
}
