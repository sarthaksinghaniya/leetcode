class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int n = nums.length;
        int[] prefix = new int[n + 1];

        // Prefix Sum
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        int ans = n + 1;

        for (int i = 0; i < n; i++) {

            int required = target + prefix[i];

            int left = i + 1;
            int right = n;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (prefix[mid] >= required) {
                    ans = Math.min(ans, mid - i);
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }

        return ans == n + 1 ? 0 : ans;
    }
}