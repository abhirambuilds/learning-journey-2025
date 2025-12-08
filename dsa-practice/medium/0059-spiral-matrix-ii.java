class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;
        int num = 1, target = n * n;

        while (num <= target) {
            for (int j = left; j <= right && num <= target; j++) {
                res[top][j] = num++;
            }
            top++;

            for (int i = top; i <= bottom && num <= target; i++) {
                res[i][right] = num++;
            }
            right--;

            for (int j = right; j >= left && num <= target; j--) {
                res[bottom][j] = num++;
            }
            bottom--;

            for (int i = bottom; i >= top && num <= target; i--) {
                res[i][left] = num++;
            }
            left++;
        }

        return res;
    }
}
