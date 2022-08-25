class Solution {
    public boolean canConstruct(String rN, String mg) {
        int A[] = new int[26];
        for(char ch : rN.toCharArray())
            A[ch-97]++;
        
        
        for(char ch: mg.toCharArray())
            if(A[ch-97]>0)
                A[ch-97]--;
       
        
        for(int i=0;i<26;i++)
         {  
            // System.out.print(A[i]+" ");
            if(A[i]!=0)
                return false;
        }
        return true;
    }
}