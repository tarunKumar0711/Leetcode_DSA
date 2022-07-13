class Solution {
    public int findPairs(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int x:nums)
            map.put(x,map.getOrDefault(x,0)+1);
        int res=0;
        for(int x:map.keySet())
        {
            if((k>0 && map.containsKey(x+k)) || (k==0 && map.get(x)>1))
                res++;
        }
        
        return res;
    }
}