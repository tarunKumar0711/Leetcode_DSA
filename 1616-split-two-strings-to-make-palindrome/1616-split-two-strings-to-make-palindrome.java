class Solution {
    public boolean isPa(String s, int i,int j)
    {
        for(;i<j;i++,j--)
            if(s.charAt(i)!=s.charAt(j))
                return false;
        return true;
    }
    public boolean check(String a, String b)
    {
        for(int l=0,r=b.length()-1;l<r;l++,r--)
            if(a.charAt(l)!=b.charAt(r))
                return isPa(a,l,r) || isPa(b,l,r);
        return true;
    }
    public boolean checkPalindromeFormation(String a, String b) {
        return check(a,b) || check(b,a);
    }
}