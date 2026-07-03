class Solution {
    public int search(int[] nums, int target) {
        int st = 0 ;
        int end = nums.length - 1 ;
        while(st<=end){
            int mid = (st + end )/2 ;

            if(nums[mid] == target){
                return mid ;
            }else if (nums[st] <= nums[mid]){  //first part is sorted 
            if(target >= nums[st] && target < nums[mid]){
                end = mid - 1;

            }else{
                st = mid + 1 ;

            }

            }else{  //second part h vo sorted h 
            if(target>nums[mid] && target <= nums[end]){
                st = mid + 1 ;

            }else {
                end = mid - 1 ;

            }

            }
        }

        return -1 ;
    }
}