class Solution {
    public int countDigitOne(int n) {
        long factor = 1;
        long ans = 0;

        while (factor <= n) {
            long low = n % factor;
            long cur = (n / factor) % 10;
            long high = n / (factor * 10);

            if (cur == 0) {
                ans += high * factor;
            } else if (cur == 1) {
                ans += high * factor + low + 1;
            } else {
                ans += (high + 1) * factor;
            }

            factor *= 10;
        }

        return (int) ans;
    }
}