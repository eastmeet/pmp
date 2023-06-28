class Solution {
    public static int[] solution(int[] arr, int[][] queries) {
        // 순서바꾸기 배열 안에 배열 queries [[3,4],[1,2],[2,3]]
        int rowOfLen = queries.length;
        int columnOfLen = queries[0].length;
        // queries에서 배열 하나씩 뽑아내기
        for (int i = 0; i < rowOfLen; i++) {
            for (int j = 0; j < columnOfLen - 1; j++) {
                // 인덱스 값
                int a = queries[i][j];
                int b = queries[i][j + 1];

                // swap
                int temp = arr[a];
                arr[a] = arr[b];
                arr[b] = temp;
                }
            }
        return arr;
    }
}