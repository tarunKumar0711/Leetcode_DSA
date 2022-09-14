class Solution {
    public boolean validUtf8(int[] data) {
        int r=0;
        for(int v : data){
            if(r==0){
                
                if((v>>5)==0b110){
                    r=1;
                }
                else if((v>>4)==0b1110){
                    r=2;
                }
                else if((v>>3)==0b11110){
                    r=3;
                }
                else if((v>>7)!=0){
                    return false;
                }
            }
            else{
                if((v>>6) == 0b10){
                    r--;
                }
                else{
                    return false;
                }
            }
        }
        
        return r==0?true:false;
    }
}