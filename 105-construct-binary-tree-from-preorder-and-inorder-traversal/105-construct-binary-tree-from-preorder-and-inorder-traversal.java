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
    public TreeNode helper(int pStart, int iStart,int iEnd,int [] preorder, int [] inorder)
    {
        if(pStart>preorder.length-1 || iStart>iEnd)
            return null;
        
        TreeNode root = new TreeNode(preorder[pStart]);
        int inIndex=0;
        for(int i=0;i<inorder.length;i++)
            if(inorder[i]==root.val)
                inIndex=i;
        
        root.left =helper(pStart+1,iStart,inIndex-1,preorder,inorder);
        root.right=helper(pStart + inIndex - iStart + 1, inIndex + 1,iEnd,preorder,inorder);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(0,0,inorder.length-1,preorder,inorder);
    }
}