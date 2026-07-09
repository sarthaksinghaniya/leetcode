class Solution {
    public int findPeakElement(int[] nums) {

        if (nums.length == 1) {
            return 0;
        } else if (nums[0] > nums[1]) {
            return 0;
        } else if (nums[nums.length - 1] > nums[nums.length - 2]) {
            return nums.length - 1;
        } else {

            int start, mid, end;

            start = 0;
            end = nums.length - 1;

            while (start < end) {
                mid = start + (end - start) / 2;

                if (nums[mid] < nums[mid + 1]) {
                    start = mid + 1;
                } else {
                    end = mid;
                }
            }


            return end;
        }

        
    }
}
