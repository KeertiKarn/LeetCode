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
    public List<Integer> rightSideView(TreeNode root) {
         if(root==null) return new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans= new ArrayList<>();
        q.add(root);
        while(!q.isEmpty()){
            int len = q.size();
            ArrayList<Integer> temp= new ArrayList<>();
            for(int i=0;i<len;i++){
               TreeNode t= q.remove();
               temp.add(t.val);
               if(t.left!=null) q.add(t.left);
               if(t.right!=null) q.add(t.right);
               if(i==len-1) ans.add(t.val);
            }
            res.add(temp);
        }
        return ans;
    }
}