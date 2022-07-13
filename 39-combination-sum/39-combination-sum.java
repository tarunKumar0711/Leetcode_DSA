class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    // List<Integer> lst = new ArrayList<>();
    public void helper(int [] cand, int t, int idx,List<Integer> lst)
    {
        if(idx==cand.length)
        {
            if(t==0)
                ans.add(new ArrayList<Integer>(lst));
            return;
        }
        if(cand[idx]<=t)
        {
            lst.add(cand[idx]);
            helper(cand,t-cand[idx],idx,lst);
            lst.remove(lst.size()-1);
        }
         helper(cand,t,idx+1,lst);
    }
    public List<List<Integer>> combinationSum(int[] cand, int t) {
       helper(cand,t,0,new ArrayList<>());
        return ans;
    }
}