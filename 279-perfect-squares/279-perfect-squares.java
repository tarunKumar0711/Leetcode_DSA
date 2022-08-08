class Solution {
    public int numSquares(int n) {
        if(n==1)
            return 1;
        int x=1;
        while(n>x*x)
            x++;
        
        int dp[]= new int[n+1];
        Arrays.fill(dp,n+1);
        dp[0]=0;
        
        for(int i=1;i<=x;i++)
        {
            for(int j=i*i;j<n+1;j++)
            {
                dp[j]= Math.min(dp[j],1+dp[j-(i*i)]);
            }
        }
        
        return dp[n];
    }
}