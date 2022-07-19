class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<String> pq = new PriorityQueue<>((a,b) -> a.length()==b.length()?b.compareTo(a):b.length()-a.length());
        
        for(int i=0;i<nums.length;i++)
            pq.offer(nums[i]);
        
        for(int i=0;i<k-1;i++)
            pq.poll();
        
        // for(int i=0;i<nums.length;i++)
        //     System.out.println(pq.poll());
        
        return pq.poll();
        
    }
}