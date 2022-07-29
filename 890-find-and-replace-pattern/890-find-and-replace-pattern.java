class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res = new ArrayList<>();
        
        for(int i=0;i<words.length;i++)
        {
            if(helper(words[i],pattern)) res.add(words[i]);
        }
       
        return res;
    }
    
    public boolean helper(String a, String b)
    {
        for(int i=0;i<b.length();i++)
        {
            if( a.indexOf(a.charAt(i)) != b.indexOf(b.charAt(i))) return false;
        }
        
        return true;
    }
}