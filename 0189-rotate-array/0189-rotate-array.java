class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length ; //jitta zaruri h utta hi kro smjhee vrna zyada effort maroge so jese vo gyi thi vese company bhi chali jayegi 
        reverse(nums, 0 , nums.length-1); //ee palattt
        reverse(nums, 0, k-1); //palat naa
        reverse(nums,k,nums.length-1); //palat
    }

    public void reverse(int [] nums , int left, int right){//kese paltu ye tho bataaaa...
        while(left<right){
            int temp =  nums[left]; //temporary var for storing vaalue of left 
            nums[left] = nums[right];
            nums[right]= temp;  //right value = left me ja ri 

            left++;
            right--;
        }
        
    }
}