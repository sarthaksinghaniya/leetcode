class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;

        // Create an array of size 2 * n
        int[] ans = new int[2 * n];

        // Copy elements into both halves
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];       // First copy
            ans[i + n] = nums[i];   // Second copy
        }

        return ans;
    }
}