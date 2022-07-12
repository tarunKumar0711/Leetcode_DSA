class Solution {
    public void setZeroes(int[][] M) {
        int r = M.length,c=M[0].length;
        
        int col0=1;
        
        for(int i=0;i<r;i++)
        {
            if(M[i][0]==0) col0=0;
            for(int j=1;j<c;j++)
            {
                if(M[i][j]==0)
                {
                    M[i][0]=0;
                    M[0][j]=0;
                }
            }
        }
        
        for(int i=r-1;i>=0;i--)
        {
            for(int j=c-1;j>=1;j--)
            {
                if(M[i][0]==0 || M[0][j]==0)
                    M[i][j]=0;
            }
            if(col0==0)
                M[i][0]=0;
        }
    }
}