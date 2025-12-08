import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), res);
        return res;
    }

    private void backtrack(int[] cand, int remain, int start, List<Integer> cur, List<List<Integer>> res) {
        if (remain == 0) {
            res.add(new ArrayList<>(cur));
            return;
        }
        for (int i = start; i < cand.length; i++) {
            int v = cand[i];
            if (v > remain) break;
            cur.add(v);
            backtrack(cand, remain - v, i, cur, res);
            cur.remove(cur.size() - 1);
        }
    }
}
