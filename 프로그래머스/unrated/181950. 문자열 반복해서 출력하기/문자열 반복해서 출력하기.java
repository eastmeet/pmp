import java.util.*;
import java.io.*;
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = null;
        try {
            tokenizer = new StringTokenizer(br.readLine());
        } catch (IOException e) {
            System.err.println("입력을 읽는 도중 오류가 발생했습니다: " + e.getMessage());
            return;
        }

        String firstInput = null;
        int secondInput = 0;
        try {
            firstInput = tokenizer.nextToken();
            secondInput = Integer.parseInt(tokenizer.nextToken());
        } catch (NoSuchElementException e) {
            System.err.println("적절한 입력이 제공되지 않았습니다. 문자열과 정수가 필요합니다.");
        } catch (NumberFormatException e) {
            System.err.println("올바른 정수 형식이 제공되지 않았습니다: " + e.getMessage());
        }
        
        System.out.println(firstInput.repeat(secondInput));
        
    }
}