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
    int res=0;
    int freq[];
    public void helper(TreeNode root){
       if(root==null)
           return;
       freq[root.val]++;
        
        if(root.left==null && root.right==null){
            int check=0;
            for(int i:freq){
                if(i%2!=0){
                    check++;
                }
                if(check>1)
                    break;
            }
            if(check<=1)
                res++;
        }
        
        else{
            helper(root.left);
            helper(root.right);
        }
        
       freq[root.val]--;
        
    }
    public int pseudoPalindromicPaths (TreeNode root) {
        if(root.left==null && root.right==null)
            return 1;
        freq = new int[10];
        
        helper(root);
        return res;
    }
}