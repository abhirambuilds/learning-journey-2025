class Solution {
    public int reverse(int x) {
        int rev = 0; // Stores the reversed number
        
        while (x != 0) {
            int pop = x % 10;  // Get the last digit
            x /= 10;           // Remove last digit from x

            // Check for overflow BEFORE actually multiplying/reversing
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0; // Overflow for positive
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0; // Overflow for negative
            }

            rev = rev * 10 + pop; // Add the digit to reversed number
        }
        
        return rev;
    }
}