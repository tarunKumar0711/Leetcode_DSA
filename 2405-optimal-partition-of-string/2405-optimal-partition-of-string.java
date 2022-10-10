class Solution {
    public int partitionString(String s) {
        int pos[] = new int[26];
        int ans=0,last=0;
        
        for(int i=0;i<s.length();i++){
            if(pos[s.charAt(i)-'a'] >= last){
                last=i+1;
                ans++;
            }
            pos[s.charAt(i)-'a']=i+1;
        }
        
        return ans;
    }
}