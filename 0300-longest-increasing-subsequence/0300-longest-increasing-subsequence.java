class Solution {
    public int lengthOfLIS(int[] nums) {
       int dp [] = new int[nums.length];
        int count=0;
        
        for(int i=0;i<nums.length;i++)
        {
            dp[i]=1;
            for(int j=0;j<i;j++)
            {
                if(nums[i]>nums[j])
                    dp[i] = Math.max(dp[i],dp[j]+1);
            }
            
            count = Math.max(count,dp[i]);
        }
        return count;
    }
}