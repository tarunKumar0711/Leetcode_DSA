class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
        
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
                pq.offer( (nums[i]-1)*(nums[j]-1));
        }
        
        return pq.poll();
    }
}