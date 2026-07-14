/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) {
            queue.add(root);
        }
        boolean leftToRight = true;
        while (!queue.isEmpty()) {
            List<Integer> level = new LinkedList<>();
            int i = queue.size();
            while (i > 0) {
                TreeNode cur =  queue.poll();
                if (leftToRight) {
                    level.add(cur.val);
                } else {
                    level.addFirst(cur.val);
                }
                
                if (cur.left != null) {
                    queue.add(cur.left);
                }
                if (cur.right != null) {
                    queue.add(cur.right);
                }
                i--;
            }
            ans.add(level);
            leftToRight = !leftToRight;
        }
        return ans;
    }
}