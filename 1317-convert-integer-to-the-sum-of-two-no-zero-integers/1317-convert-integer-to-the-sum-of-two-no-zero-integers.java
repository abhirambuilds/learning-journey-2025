public class Solution {
    public int[] getNoZeroIntegers(int n) {
        for (int a = 1; a <= n / 2; a++) {
            int b = n - a;
            if (!containsZero(a) && !containsZero(b)) {
                return new int[]{a, b};
            }
        }
        return new int[]{-1, -1};
    }
    private boolean containsZero(int x) {
        while (x > 0) {
            if (x % 10 == 0) return true;
            x /= 10;
        }
        return false;
    }
}