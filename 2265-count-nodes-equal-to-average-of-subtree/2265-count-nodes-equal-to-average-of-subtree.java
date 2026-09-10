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
    int count=0;
    public int averageOfSubtree(TreeNode root) {
        helper(root);
        return count;
    }
    public void helper(TreeNode root){
        if(root==null) return;
        int avg= sum(root)/size(root);
        if(root.val==avg) count++;
        helper(root.left);
        helper(root.right);
    }
    public int sum(TreeNode root){
       if(root==null) return 0;
        return root.val+sum(root.left)+sum(root.right);
    }
    public int size(TreeNode root){
        if(root==null) return 0;
        return 1+size(root.left)+size(root.right);
    }
}