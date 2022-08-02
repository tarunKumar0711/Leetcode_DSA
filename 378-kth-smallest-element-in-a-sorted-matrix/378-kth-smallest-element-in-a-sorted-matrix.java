class Solution {
    public int kthSmallest(int[][] matrix, int k) {
     int low = matrix[0][0], high = matrix[matrix.length-1][matrix.length-1];
        
        while(low<high)
        {
            int mid = low+(high-low)/2;
            int rank = calRank(matrix,mid);
            if(rank<k)
                low= mid+1;
            else
              high=mid;
        }
        return low;
    }
    
    public int calRank(int [][]mat, int r)
    {
        int j=0,i=mat.length-1,count=0;
        
        while(i>=0 && j<mat.length)
        {
            if(mat[i][j]>r) i--;
            
            else
            {
                count= count+i+1;
                j++;
            }
        }
        return count;
    }
}