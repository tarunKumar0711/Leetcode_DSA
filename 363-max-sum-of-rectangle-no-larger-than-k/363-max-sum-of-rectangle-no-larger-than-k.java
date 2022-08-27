class Solution {
    public int maxSumSubmatrix(int[][] matrix, int k) {
     int r = matrix.length;
        int cl = matrix[0].length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<r;i++)
        {
            int [] colSum = new int[cl];
            for(int j=i;j<r;j++)
            {
                for(int p=0;p<cl;p++)
                {
                    colSum[p]+= matrix[j][p];
                }
                max = Math.max(max,find(colSum,k));
            }
        }
        return max;   
    }
    
    private int find(int[] sum,int k)
    {
        TreeSet<Integer> set = new TreeSet<Integer>();
        int result = Integer.MIN_VALUE;
        int pSum =0;
        set.add(0);
        for(int x=0;x<sum.length;x++)
        {
            pSum += sum[x];
            Integer target = set.ceiling(pSum-k);
            if(target!=null)
            {
                result = Math.max(result , pSum-target);
            }
            set.add(pSum);
        }
        return result;
    }
}