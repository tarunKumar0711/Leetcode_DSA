class Solution {
    public String frequencySort(String s) {
       List<Character>[] freq = new List[s.length()+1];
        
        for(int i=0;i<=s.length();i++)
            freq[i]=new ArrayList<Character>();
        
        int F[] = new int[256];

        for(char ch:s.toCharArray())
            F[ch]++;
        
        for(int i=0;i<256;i++)
            if(F[i]>0)
                freq[F[i]].add((char)i);
        
        String ans="";
        for(int i=freq.length-1;i>0;i--)
        {
            if(freq[i].size()>0)
            {
                for(char c:freq[i])
                {
                    for(int j=0;j<i;j++)
                        ans+=c;
                }
            }
        }
        
        return ans;
    }
}

