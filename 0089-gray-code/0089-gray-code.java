class Solution {
    public List<Integer> grayCode(int n) {

        // Result list
        List<Integer> ans = new ArrayList<>();

        // Total Gray codes = 2^n
        // Example:
        // n = 2 -> 4 numbers (0 to 3)
        // n = 3 -> 8 numbers (0 to 7)
        for (int i = 0; i < (1 << n); i++) {

            /*
             Gray Code Formula:
             gray = i ^ (i >> 1)

             XOR with the right-shifted value ensures
             that every consecutive Gray code differs
             by exactly one bit.
            */

            ans.add(i ^ (i >> 1));

            /*
            =======================
            Dry Run for n = 2
            =======================

            Total numbers = 2^2 = 4

            i = 0
            Binary(i)      = 00
            i >> 1         = 00
            Gray           = 00 ^ 00 = 00
            Decimal        = 0

            ans = [0]


            i = 1
            Binary(i)      = 01
            i >> 1         = 00
            Gray           = 01 ^ 00 = 01
            Decimal        = 1

            ans = [0, 1]


            i = 2
            Binary(i)      = 10
            i >> 1         = 01
            Gray           = 10 ^ 01 = 11
            Decimal        = 3

            ans = [0, 1, 3]


            i = 3
            Binary(i)      = 11
            i >> 1         = 01
            Gray           = 11 ^ 01 = 10
            Decimal        = 2

            ans = [0, 1, 3, 2]


            Final Output:
            [0, 1, 3, 2]

            Binary Representation:

            00
            01   (1 bit changed)
            11   (1 bit changed)
            10   (1 bit changed)

            Last -> First

            10 -> 00 (1 bit changed)

            Hence this is a valid Gray Code sequence.
            */
        }

        return ans;
    }
}