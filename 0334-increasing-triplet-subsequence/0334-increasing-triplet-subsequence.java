class Solution {
    public boolean increasingTriplet(int[] nums) {
        int left =Integer.MAX_VALUE,mid=Integer.MAX_VALUE;
        
        for(int i:nums){
            if(i>mid)
                return true;
            else if(i<mid && i>left)
                mid=i;
            else if(i<left)
                left=i;
        }
        
        return false;
    }
}