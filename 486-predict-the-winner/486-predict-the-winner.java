class Solution {
public boolean PredictTheWinner(int[] nums) {
        return canWin(nums, 0, nums.length - 1, 0, 0, 0);
    }
    
    private boolean canWin(int[] nums, int l, int r, int s1, int s2, int step) {
        if (l == r) {
            return s1 + nums[l] > s2 || (step % 2 == 0 && s1 + nums[l] == s2);
        }
        boolean left = canWin(nums, l + 1, r, s2, s1 + nums[l], step + 1);
        boolean right = canWin(nums, l, r - 1, s2, s1 + nums[r], step + 1);
        return !left || !right;
    }
}