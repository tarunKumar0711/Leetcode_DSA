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
    public List<Integer> helper(TreeNode root, List<Integer> lst)
    {
        if(root==null)
            return lst;
        helper(root.left,lst);
        lst.add(root.val);
        helper(root.right,lst);
        
        return lst;
     
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        // List<Integer> lst = new ArrayList<>();
        return helper(root,new ArrayList<>());
    }
}