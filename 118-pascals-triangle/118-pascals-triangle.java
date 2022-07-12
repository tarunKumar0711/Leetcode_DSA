class Solution {
    public List<List<Integer>> generate(int nR) {
        List<List<Integer>> res = new ArrayList<>();
        
        if(nR==0)
            return res;
        res.add(new ArrayList<>());
        res.get(0).add(1);
        
        for(int i=1;i<nR;i++)
        {
            List<Integer> lst = new ArrayList<>();
            lst.add(1);
            for(int j=1;j<i;j++)
                lst.add(res.get(i-1).get(j-1) + res.get(i-1).get(j));
            lst.add(1);
            res.add(lst);
        }
        
        return res;
    }
}