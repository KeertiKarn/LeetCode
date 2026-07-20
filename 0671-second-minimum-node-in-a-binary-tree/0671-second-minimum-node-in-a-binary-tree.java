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
    public int findSecondMinimumValue(TreeNode root) {
        List<Integer> result= new ArrayList<>();
        inorder(root,result);
        Collections.sort(result);
        int first = result.get(0);
        for (int x : result){
            if (x != first)
                return x;
        }

        return -1;

    }
    public void inorder(TreeNode root,List<Integer> result){
        if(root==null) return;
        inorder(root.left,result);
        result.add(root.val);
        inorder(root.right,result);
    }
}