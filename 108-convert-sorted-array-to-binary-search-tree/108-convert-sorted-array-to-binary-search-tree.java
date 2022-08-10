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
    private TreeNode sortedArrayToBST(int[] nums, int start, int end) {
        int middle = (start + end)/2;
        TreeNode root = new TreeNode(nums[middle]);
        if(middle > start) {
            root.left = sortedArrayToBST(nums, start, middle-1);
        }
        if(middle < end) {
            root.right = sortedArrayToBST(nums, middle+1, end);
        }
        
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
         return sortedArrayToBST(nums, 0, nums.length-1);
    }
}