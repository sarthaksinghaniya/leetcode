class Solution {
    public int fib(int n) {
        int i,first,last,next;

        if(n==0){
            return 0;

        }
        first = 0;
        last = 1;

        for(i=1;i<n;i++){
            next = first + last;
            first = last;
            last = next;
        }

        return last;
        
    }
}



          
    