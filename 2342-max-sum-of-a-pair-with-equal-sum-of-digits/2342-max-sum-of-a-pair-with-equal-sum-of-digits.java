class Solution {
    
    public int helper(int n)
    {
        if(n<10)
            return n;
        int sum=0;
        while(n!=0)
        {
            sum+=n%10;
            n/=10;
        }
        
        return sum;
    }
    public int maximumSum(int[] nums) {
        int max=-1;
        int A[] = new int[82];
        for(int n:nums)
        {
            int sum = helper(n);
            if(A[sum]!=0)
            {
                max=Math.max(max,n+A[sum]);
            }
            A[sum]=Math.max(A[sum],n);
        }
        return max;
        
    }
}