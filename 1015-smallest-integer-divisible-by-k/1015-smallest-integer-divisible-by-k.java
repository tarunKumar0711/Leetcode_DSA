class Solution {
    public int smallestRepunitDivByK(int k) {
        if(k%2==0 || k%5==0)
            return -1;
        
           if(k==1)
               return 1;
        
//         Long upperLimit=1L,ans=11L;
//         int copy=k,c=1;
//         System.out.println(copy);
//         while(copy-- >0)
//         {
//             upperLimit = upperLimit*10+1;
//             System.out.println(upperLimit+" "+c++);
//         }
        
        
//         int cnt=2;
//         while(ans<=upperLimit)
//         {
//             if(ans%k==0)
//                 return cnt;
//             ans= ans*10+1;
//             cnt++;
//             // System.out.println(cnt+" "+ans);
//         }
        int n=0;
        int count=0;
        while(true)
        {
            n=n%k*10+1;
            count++;
            if(n%k==0)
                return count;
            // if(set.contains(n))
            //     return -1;
            // set.add(n);
        }
        // return -1;
    }
}