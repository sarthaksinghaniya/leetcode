class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()) ; //max pq 
        for(int ele : stones ){
            pq.add(ele) ; //stores the value in pq 
        }
        while(pq.size()>1){
            int max = pq.remove() ;
            int smax = pq.remove() ;

            int nstone = max -smax ;
            if(nstone!=0){
                pq.add(nstone) ;
            }
        }
        if(pq.size() == 0){
            return 0 ;
        }else{
            return pq.remove() ;
        }

    }
}