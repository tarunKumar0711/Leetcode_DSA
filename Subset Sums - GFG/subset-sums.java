// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i = 0; i < N ; i++){
			    arr.add(sc.nextInt());
			}
            Solution ob = new Solution();
         
            ArrayList<Integer> ans = ob.subsetSums(arr,N);
            Collections.sort(ans);
            for(int sum : ans){
                System.out.print(sum+" ");
            }
            System.out.println();
        }  
    }
}
// } Driver Code Ends


//User function Template for Java//User function Template for Java
class Solution{
   ArrayList<Integer> helper(int idx, int sum,ArrayList<Integer> arr,int n)
    {
        if(idx==n)
        {
            ArrayList<Integer> lst = new ArrayList<>();
            lst.add(sum);
            return lst;
        }
       ArrayList<Integer> left = helper(idx+1,sum+arr.get(idx),arr,n);
       ArrayList<Integer> right = helper(idx+1,sum,arr,n);
       
       left.addAll(right);
       return left;
    }
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        // code here
        return helper(0,0,arr,N);
    }
}