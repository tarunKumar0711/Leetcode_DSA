class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] count = new int[26],temp;
        
        for(String st:words2)
        {
            temp = helper(st);
            for(int i=0;i<26;i++)
                count[i]=Math.max(count[i],temp[i]);
        }
        
        List<String> ans = new ArrayList<>();
        
        for(String s:words1)
        {
            temp=helper(s);
            int i=0;
            for(i=0;i<26;i++)
            {
                if(count[i]>temp[i])
                    break;
            }
            if(i==26)
                ans.add(s);
        }
        
        return ans;
    }
    
    public int[] helper(String word)
    {
        int[] count = new int[26];
        
        for(char c: word.toCharArray())
            count[c-97]++;
        
        return count;
    }
}