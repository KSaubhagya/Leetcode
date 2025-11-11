class Solution {
    public boolean isPalindrome(int x) {
        
        if (x < 0) {
            return false;
        }

        int original = x;
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10; // get last digit
            x = x / 10;         // remove last digit

            // Check for overflow (optional for int range)
            if (reversed > (Integer.MAX_VALUE - digit) / 10) {
                return false;
            }

            reversed = reversed * 10 + digit;
        }

        // A palindrome reads the same forwards and backwards
        return original == reversed;
    }
}
