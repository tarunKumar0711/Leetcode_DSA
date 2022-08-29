class Solution {
    public void DFS(int i,int j,char[][]grid)
    {
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length)
            return;
        // return if current position is of water or is already visited
        if(grid[i][j] == '2' || grid[i][j] == '0')
            return;
        
        // mark the current as visited
        grid[i][j] = '2';
        
        // do DFS in all 4 directions
        DFS(i+1,j,grid);
        DFS(i,j-1,grid);
        DFS(i-1,j,grid);
        DFS(i,j+1,grid);
    }
    public int numIslands(char[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]=='1')
                {
                    DFS(i,j,grid);
                    count++;
                }
            }
        }
        return count;
    }
}