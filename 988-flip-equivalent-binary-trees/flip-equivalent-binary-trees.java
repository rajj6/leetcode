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
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return true;
        if (root1 == null || root2 == null) return false;
        // if (root1.val != root2.val) return false;
        // if (isSame(root1.left, root2.left) && isSame(root1.right, root2.right)) {
        //     // No swap at this level
        //     return flipEquiv(root1.left, root2.left) && flipEquiv(root1.right, root2.right);
        // } else if (isSame(root1.left, root2.right) && isSame(root1.right, root2.left)){
        //     // Swap hua hai
        //     return flipEquiv(root1.left, root2.right) && flipEquiv(root1.right, root2.left);
        // } else {
        //     return false;
        // }
        return (root1.val == root2.val) && ((flipEquiv(root1.left, root2.left) && flipEquiv(root1.right, root2.right)) || (flipEquiv(root1.left, root2.right) && flipEquiv(root1.right, root2.left)));
    }

    // public boolean isSame(TreeNode node1, TreeNode node2) {
    //     if (node1 == null && node2 == null) return true;
    //     if (node1 == null || node2 == null) return false;
    //     return node1.val == node2.val;
    // }
}