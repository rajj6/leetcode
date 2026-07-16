/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {

    public TreeNode ans = null;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // fun(root, p, q);
        // return ans;

        if (root == null || root == p || root == q) {
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p , q);
        TreeNode right = lowestCommonAncestor(root.right, p , q);

        if (left != null && right != null) {
            return root;
        }

        return left != null ? left : right;
    }

    int fun(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return 0;
        int left = fun(root.left, p, q);
        int right = fun(root.right, p, q);
        int self  = 0;
        if (root.val == p.val || root.val == q.val) {
            self = 1;
        }
        int total = left + right + self;
        if (total == 2 && ans == null) {
            ans = root;
        }
        return total;
    }
}