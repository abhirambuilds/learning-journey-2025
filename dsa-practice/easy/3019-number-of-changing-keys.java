class Solution {
    public int countKeyChanges(String s) {
        if (s == null || s.length() <= 1) return 0;
        int changes = 0;
        char prev = Character.toLowerCase(s.charAt(0));
        for (int i = 1, n = s.length(); i < n; ++i) {
            char cur = Character.toLowerCase(s.charAt(i));
            if (cur != prev) {
                changes++;
                prev = cur;
            }
        }
        return changes;
    }
}