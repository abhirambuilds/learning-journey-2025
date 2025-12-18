class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] res = new String[n];
        int[][] a = new int[n][2];
        for (int i = 0; i < n; i++) {
            a[i][0] = score[i];
            a[i][1] = i;
        }
        Arrays.sort(a, (x, y) -> y[0] - x[0]);
        for (int i = 0; i < n; i++) {
            if (i == 0) res[a[i][1]] = "Gold Medal";
            else if (i == 1) res[a[i][1]] = "Silver Medal";
            else if (i == 2) res[a[i][1]] = "Bronze Medal";
            else res[a[i][1]] = String.valueOf(i + 1);
        }
        return res;
    }
}
