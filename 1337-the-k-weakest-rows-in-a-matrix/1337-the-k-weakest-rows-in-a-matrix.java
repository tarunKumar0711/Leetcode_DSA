class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int []> pq = new PriorityQueue<>((a,b) -> b[0]!=a[0]?a[0]-b[0]:a[1]-b[1]);
        
        int ans[] = new int[k];
        
        for(int i=0;i<mat.length;i++)
        {
            int n=0;
            for(int j=0;j<mat[0].length;j++)
            {
                if(mat[i][j]==1)
                    n++;
                else
                    break;
            }
            pq.offer(new int[]{n,i});
        }
        
//         while(pq.size()>k)
//             pq.poll();
        
//         while(k>0)
//             ans[--k]=pq.poll()[1];
        
//         while(pq.size()>0)
//             System.out.println(Arrays.toString(pq.poll()));
        int x=0;
        while(k>x)
            ans[x++]=pq.poll()[1];
        
        return ans;
    }
}