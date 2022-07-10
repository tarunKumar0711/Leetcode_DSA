class Solution {
    public int minCostClimbingStairs(int[] cost) {
     
        
        for(int i = 2; i<cost.length ;i++)
        {
            if(cost[i-1]<cost[i-2])
                cost[i]+=cost[i-1];
            else if(cost[i-1]>=cost[i-2])
                cost[i]+=cost[i-2];
        }
        
        return Math.min(cost[cost.length-2],cost[cost.length-1]);
    }
}