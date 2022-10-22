class Solution {
    public int lengthOfLIS(int[] nums) {
        int dp[] = new int[nums.length];
        dp[0]=1;
        
        for(int i=0;i<nums.length;i++)
        {
            dp[i]=1;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i]>nums[j])
                    dp[i]=Math.max(dp[i],dp[j]+1);
            }
        }
        
        int res=dp[0];
        for(int i:dp)
            res=Math.max(res,i);
        
        return res;
    }
}