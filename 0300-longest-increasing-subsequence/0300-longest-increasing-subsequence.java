class Solution {
    public int lengthOfLIS(int[] nums) {
        int dp [] = new int[nums.length];
        dp[0]= nums[0];
        int len =1;
        
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>dp[len-1])
            {
                dp[len]=nums[i];
                len++;
            }
            else
            {
                int c = findIndex(dp,0,len-1,nums[i]);
                dp[c] = nums[i];
            }
        }
        return len;
    }
    
    public int findIndex(int dp[],int s, int e,int x)
    {
        while(e>s)
        {
            int m = s+(e-s)/2;
            if(x<=dp[m])
                e=m;
            else
                s=m+1;
        }
        
        return e;
    }
}