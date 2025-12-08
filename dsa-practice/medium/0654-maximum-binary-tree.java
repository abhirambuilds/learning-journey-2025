// Definition for a binary tree node.
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        int n = nums.length;
        TreeNode[] nodes = new TreeNode[n];
        for (int i = 0; i < n; i++) nodes[i] = new TreeNode(nums[i]);

        java.util.Deque<Integer> stack = new java.util.ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && nums[i] > nums[stack.peek()]) {
                int idx = stack.pop();
                // popped node becomes left child of current node
                nodes[i].left = nodes[idx];
            }
            if (!stack.isEmpty()) {
                // current node becomes right child of stack.peek()
                nodes[stack.peek()].right = nodes[i];
            }
            stack.push(i);
        }

        // bottom of stack (last element in stack) is index of maximum element (root)
        while (stack.size() > 1) stack.pop();
        return nodes[stack.peek()];
    }
}
