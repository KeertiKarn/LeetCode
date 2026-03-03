class Solution {
    public int pathSum(TreeNode root, int target) {
        if(root==null) return 0;
        return path(root,target) + pathSum(root.left,target) + pathSum(root.right,target);       
    }
    public int path(TreeNode root, long target){
        int count=0;
       if(root==null) return count;
       if(root.val==target) count++;
       count= count+path(root.left , target-root.val) + path(root.right,target-root.val);
       return count;

    }
}