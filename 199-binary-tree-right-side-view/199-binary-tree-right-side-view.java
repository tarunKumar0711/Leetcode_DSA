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
    public void helper(TreeNode curr, List<Integer> lst, int currD)
    {
        if(curr==null)
            return;
        if(currD==lst.size())
            lst.add(curr.val);
        
        helper(curr.right,lst,currD+1);
        helper(curr.left,lst,currD+1);
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> lst = new ArrayList<>();
        helper(root,lst,0);
        return lst;
    }
}