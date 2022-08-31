class Solution {
    int dir[][] = {{0,1},{0,-1},{1,0},{-1,0}};
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> res = new ArrayList<>();
        
        if(heights.length==0 || heights==null) return res;
        
        
        int n=heights.length, m= heights[0].length;
        boolean [][] pac = new boolean[n][m];
        boolean [][] atl = new boolean[n][m];
        
        for(int i=0;i<m;i++)
        {    
            DFS(0,i,heights,pac,Integer.MIN_VALUE);
            DFS(n-1,i,heights,atl,Integer.MIN_VALUE);
        }
        
        for(int i=0;i<n;i++)
        {
            DFS(i,0,heights,pac,Integer.MIN_VALUE);
            DFS(i,m-1,heights,atl,Integer.MIN_VALUE);
        }
        
        
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(pac[i][j] && atl[i][j])
                    res.add(Arrays.asList(i,j));
            }
        }
        
        return res;
    }
    
    public void DFS(int i,int j, int[][] mat, boolean[][]ocean,int prev)
    {
        if(i<0 || j<0 || i>=mat.length || j>=mat[0].length || ocean[i][j]|| mat[i][j]<prev)
            return;
        ocean[i][j] = true;
        
        for(int []d: dir)
        {
            DFS(i+d[0],j+d[1],mat,ocean,mat[i][j]);
        }
    }
}