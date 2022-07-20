class Solution {
    public String longestDiverseString(int a, int b, int c) {
        int size = a+b+c;
        int A=0,B=0,C=0;
        String ans="";
            
        for(int i=0;i<size;i++)
        {
            if((a>=b && a>=c && A!=2) || (B==2 && a>0) || (C==2 && a>0))
            {
                ans+='a';
                A++;
                a--;
                B=0;C=0;
            }
            
            else if((b>=a && b>=c && B!=2) || (A==2 && b>0) || (C==2 && b>0))
            {
                ans+='b';
                B++;
                b--;
                A=0;C=0;
            }
            
            else if((c>=b && c>=a && C!=2) || (B==2 && c>0) || (A==2 && c>0))
            {
                ans+='c';
                C++;
                c--;
                A=0;B=0;
            }
        }
        
        return ans;
        
    }
}