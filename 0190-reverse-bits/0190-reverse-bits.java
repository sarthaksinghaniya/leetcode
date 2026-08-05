class Solution {
    public int reverseBits(int n) {
        int result = 0 ;
        for(int i = 0 ; i < 32 ; i++){
            result <<= 1 ;  //left shift
            result |= (n&1); //last bit add kr re ho 
            n >>= 1 ; //n ko right shift ;
        }
        return result ;
    }
}