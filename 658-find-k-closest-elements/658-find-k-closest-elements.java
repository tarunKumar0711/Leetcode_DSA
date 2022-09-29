class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) 
    {
        List<Integer> lst = new ArrayList<>();
        int low=0,high = arr.length-1;
        while(high-low>=k)
        {
            if(Math.abs(arr[low]-x) > Math.abs(arr[high]-x))
                low++;
            else
                high--;
        }
        
        for(int i=low;i<=high;i++)
        {
            lst.add(arr[i]);
        }
        
        return lst;
        
    }
}