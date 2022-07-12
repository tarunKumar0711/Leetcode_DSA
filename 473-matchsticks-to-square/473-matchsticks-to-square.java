class Solution {
    public boolean helper(int []nums, int idx, int a, int b, int c, int d, int target)
    {
        if(a==target && b==target && c==target && d==target) return true;
        
        if(a>target || b>target || c>target || d>target ) return false;
        
        if(helper(nums,idx-1,a+nums[idx],b,c,d,target))
            return true;
         if(helper(nums,idx-1,a,b+nums[idx],c,d,target))
             return true;
        if(helper(nums,idx-1,a,b,c+nums[idx],d,target))
            return true;
         if(helper(nums,idx-1,a,b,c,d+nums[idx],target))
             return true;
        
        return false;
    }
    public boolean makesquare(int[] mS) {
        if(mS.length<4)
            return false;
        
        int per = 0;
        for(int i:mS)
            per+=i;
        if(per%4!=0) return false;
    
        Arrays.sort(mS);
        return helper(mS,mS.length-1,0,0,0,0,per/4);
    }
}