class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {

        int ans = numBottles ;
        
        while(numBottles >= numExchange){

            int newbottles = numBottles / numExchange ;

            int remaning = numBottles % numExchange ; 

            ans = ans + newbottles ;

            numBottles = newbottles + remaning ;

        }

        return ans ;
    }
}
