class Solution {
    public int coinChange(int[] coins, int amt) {
       int dp[] = new int[amt+1];
        Arrays.fill(dp,amt+1);
        dp[0]=0;
        for(int coin:coins)
        {
            for(int i=coin;i<=amt;i++)
            {
                if(i==coin)
                    dp[i]=1;
                else if(i>coin)
                    dp[i]=Math.min(dp[i],1+dp[i-coin]);
            }
        }
        //System.out.println(Arrays.toString(dp));
        return dp[amt]==amt+1?-1:dp[amt];
    }
}