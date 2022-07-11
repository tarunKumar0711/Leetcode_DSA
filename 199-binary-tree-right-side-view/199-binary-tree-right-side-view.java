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
        if(root == null)
            return new ArrayList<>();
        
        Queue<TreeNode> q = new LinkedList();
        q.offer(root);
        
        List<Integer> lst = new ArrayList<>();
        
        while(!q.isEmpty())
        {
            int size = q.size();
            while(size-- >0)
            {
                TreeNode curr = q.poll();
                if(size==0)
                    lst.add(curr.val);
                
                if(curr.left!=null)
                    q.offer(curr.left);
                if(curr.right!=null)
                    q.offer(curr.right);
            }
        }
        
        return lst;
    }
}