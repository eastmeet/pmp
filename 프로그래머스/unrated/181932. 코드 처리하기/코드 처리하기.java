class Solution {
    public String solution(String code) {
        StringBuilder ret = new StringBuilder();
        int mode = 0;
        char[] c = code.toCharArray();
        for (int idx = 0; idx < code.length(); idx++) {
            switch (mode) {
                case 0: {
                    if (c[idx] != '1' && (idx % 2) == 0) {
                        ret.append(c[idx]);
                    }
                    if (c[idx] == '1') {
                        mode = 1;
                    }
                    break;
                }
                case 1: {
                    if (c[idx] != '1' && (idx % 2) != 0) {
                        ret.append(c[idx]);
                    }
                    if (c[idx] == '1') {
                        mode = 0;
                    }
                    break;
                }
            }
        }
        return ret.length() == 0 ? "EMPTY" : ret.toString();
    }
}