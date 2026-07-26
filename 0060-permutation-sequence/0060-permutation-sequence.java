import java.util.*;

class Solution {
    public String getPermutation(int n, int k) {
        
        List<Integer> numbers = new ArrayList<>();
        StringBuilder result = new StringBuilder();
        
        // Build list 1 to n
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }
        
        // Precompute factorial values
        int[] factorial = new int[n];
        factorial[0] = 1;
        for (int i = 1; i < n; i++) {
            factorial[i] = factorial[i - 1] * i;
        }
        
        // Convert k to 0-based index
        k--; 
        
        // Build permutation
        for (int i = n; i > 0; i--) {
            int fact = factorial[i - 1];
            int index = k / fact;
            
            result.append(numbers.get(index));
            numbers.remove(index);
            
            k %= fact;
        }
        
        return result.toString();
    }
}
