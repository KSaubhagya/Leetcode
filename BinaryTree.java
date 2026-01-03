/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {} // constructor for treenode
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true; // empty tree is symmetric
        return isMirror(root.left, root.right);
    }
    private boolean isMirror(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return true; // both are null
        if (t1 == null || t2 == null) return false; // only one is null
        if (t1.val != t2.val) return false; // values don't match
        
        // check recursively: left of t1 vs right of t2 AND right of t1 vs left of t2
        return isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);
    }
}
