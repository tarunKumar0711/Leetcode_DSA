class Solution {
    public int maxDistToClosest(int[] seats) {
        int max=-1,curr=-1;
        
        for(int i=0;i<seats.length;i++)
        {
            if(seats[i]==1 && curr==-1)
            {
                curr=i;
                max= Math.max(max,i);
            }
            
            else if(seats[i]==1 && curr!=-1)
            {
                max = Math.max(max,(i-curr)/2);
                curr=i;
            }
        }
        
        if(curr!=seats.length-1)
            max=Math.max(max,seats.length-1-curr);
        
        return max;
    }
}