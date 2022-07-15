class Solution {
    public int DFS(int r, int c, int [][]grid)
    {
        if(r>=0 && r<grid.length && c>=0 && c<grid[r].length && grid[r][c]==1)
        {
            grid[r][c]=0;
            return 1 + DFS(r-1,c,grid) + DFS(r+1,c,grid) + DFS(r,c+1,grid) + DFS(r,c-1,grid);
        }
        
        return 0;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int max =0;
        
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]==1)
                {
                    max = Math.max(max, DFS(i,j,grid));
                }
            }
        }
        
        return max;
    }
}