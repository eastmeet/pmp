class Solution {
    public String solution(String code) {
        // abc1abc1abc
        int mode = 0;
        String ret = "";
        char[] c = code.toCharArray();
        for (int idx = 0; idx < code.length(); idx++) {
            // mode가 0일때
            switch (mode) {
                case 0: {
                    if (c[idx] != '1' && (idx % 2) == 0) {
                        ret += c[idx];
                    } else if (c[idx] == '1') {
                        mode = 1;
                    }
                    break;
                }
                case 1: {
                    if (c[idx] != '1' && (idx % 2) != 0) {
                        ret += c[idx];
                    } else if (c[idx] == '1') {
                        mode = 0;
                    }
                    break;
                }
            }
        }
        if (ret.isEmpty()) {
            return "EMPTY";
        }

        return ret;
    }
}