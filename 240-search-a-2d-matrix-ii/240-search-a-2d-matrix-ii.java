class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int i=matrix.length-1,j=0;
        while(i>=0 && j<matrix[i].length)
        {
            if(matrix[i][j]==target)
                return true;
            if(target<matrix[i][j])
                i--;
            else
                j++;
        }
        return false;
        
    }
}