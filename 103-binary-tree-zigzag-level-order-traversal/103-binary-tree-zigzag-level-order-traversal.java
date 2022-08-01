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
        
        if(root==null)
            return ans;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean flag=true;
        
        while(!q.isEmpty())
        {
            int size=q.size();
            List<Integer> lst = new ArrayList<>();
            while(size-- >0)
            {
                TreeNode n = q.poll();
                if(flag)
                    lst.add(n.val);
                else
                    lst.add(0,n.val);
                if(n.left!=null)
                    q.offer(n.left);
                if(n.right!=null)
                    q.offer(n.right);
            }
            flag=!flag;
            ans.add(lst);
        }
        
        return ans;
    }
}