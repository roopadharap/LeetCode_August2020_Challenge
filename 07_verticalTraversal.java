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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> lst = new ArrayList<>();
        if(root == null)
            return lst;
        
        HashMap<Integer, int[]> hm = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<>();
        int min = 0, max = 0;
        
        q.add(root);
        hm.put(root.val, new int[] {0, 0});
        
        while(!q.isEmpty())
        {
            TreeNode temp = q.poll();
            int[] c = hm.get(temp.val);
            
            if(temp.left != null)
            {
                int[] l = new int[2];
                l[0] = c[0] - 1;
                l[1] = c[1] + 1;
                q.add(temp.left);
                hm.put(temp.left.val, l);
            }
            
            if(temp.right != null)
            {
                int[] r = new int[2];
                r[0] = c[0] + 1;
                r[1] = c[1] + 1;
                q.add(temp.right);
                hm.put(temp.right.val, r);
            }
        }
        
        int maxR = 0;
        int maxL = 0;
        
        for(Integer n: hm.keySet())
        {
            if(hm.get(n)[0] > maxR){
                maxR = hm.get(n)[0];
            }
            if(hm.get(n)[0] < maxL){
                maxL = hm.get(n)[0];
            }
        }
        
        for(int i = maxL; i <= maxR; i++)
        {
            lst.add(new ArrayList<Integer>());
        }
        
        
        for(Integer n: hm.keySet())
        {
            lst.get(hm.get(n)[0] - maxL).add(n);
            
        }
        
        for(List<Integer> sLst: lst)
        {
            Collections.sort(sLst, (a, b) -> hm.get(a)[1] - hm.get(b)[1]);
        }
        
        return lst;
    }
    
    
}