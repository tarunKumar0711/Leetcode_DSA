class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        
        int i=0,j=tokens.length-1,res=0,po=0;
        while(i<=j){
            if(power>=tokens[i]){
                res= Math.max(res,++po);
                power-=tokens[i++];
            }
            else if(po>0){
                po--;
                power+=tokens[j--];
            }
            else{
                break;
            }
        }
        
        return res;
    }
}

