class Solution {
    public String pushDominoes(String dominoes)
    {
        int l[] = new int[dominoes.length()];
        int r[] = new int[dominoes.length()];
        char  fin [] = new char[dominoes.length()];
        int flag =0;
        
        for(int i = dominoes.length()-1;i>=0;i--)
        {
            char c = dominoes.charAt(i);
            if(c == 'L')
            {
                l[i]=i;
                if(l[i]==0)
                    l[i]=-1;
                flag=i;
            }
            
            if(c == '.')
            {
                if(flag>0)
                    l[i]=flag-i;
                else
                    l[i]=0;
            }
            
            if(c == 'R')
            {
                flag=0;
                l[i]=0;
            }
        }
        
       
        flag =0;
        
        for(int i =0;i<dominoes.length();i++)
        {
            char c = dominoes.charAt(i);
            if(c == 'L')
            {
                r[i]=0;
                flag=0;
            }
            
            if(c == '.')
            {
                if(flag>0)
                    r[i]= i-flag+1;
                else
                    r[i]=0;
            }
            
            if(c == 'R')
            {
                flag=i+1;
                r[i]=i+1;
            }
        }
      
        
        for(int i=0;i<dominoes.length();i++)
        {
            if( r[i] == l[i])
                fin[i]= '.';
            
            else if(l[i]==0)
                fin[i]= 'R';
            else if(r[i]==0)
                fin[i]='L';
            
            else
            {
                if(l[i]<r[i])
                    fin[i]= 'L';
                if(r[i]<l[i])
                    fin[i]= 'R';
            }
        }
        

        return new String(fin);
        
    }
}