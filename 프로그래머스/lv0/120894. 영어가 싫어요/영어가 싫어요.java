class Solution {
    public long solution(String numbers) {
            StringBuilder answer = new StringBuilder();
            String[] bunch = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
            String[] number = new String[]{"0", "1", "2", "3", "4,", "5", "6", "7", "8", "9"};
            while (!numbers.equals("")) {
                for (int i = 0; i < bunch.length; i++) {
                    if (numbers.startsWith(bunch[i])) {
                        answer.append(number[i]);
                        numbers = numbers.substring(bunch[i].length());
                    }
                }
            }
            String replace = answer.toString().replace(",", "");
            System.out.println("replace = " + replace);
            return Long.parseLong(replace);
    }
}