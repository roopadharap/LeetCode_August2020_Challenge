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
    int totWays=0;
    
    public int pathSum(TreeNode root, int sum) {
        if(root==null)
            return 0;
        else
            dfs(root,sum);
        
        pathSum(root.left,sum);
        pathSum(root.right,sum);
        return totWays;
    }
    
    private void dfs(TreeNode root,int sum)
    {
        if(root==null)
            return;
        
        if(root.val==sum)
            totWays++;
        
        dfs(root.left, sum - root.val);
        dfs(root.right, sum - root.val);
        
    }
}