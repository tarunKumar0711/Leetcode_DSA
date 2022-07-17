class Solution {
    public int findCenter(int[][] edges) {
       int n =edges.length;
        int degree[] = new int[n+2];
        
        for(int a[] : edges)
        {
            degree[a[0]]++;
            degree[a[1]]++;
        }
        
        
        for(int i=0;i<n+2;i++)
        {
            if(degree[i]==n)
                return i;
        }
        
        return 0;
    }
}