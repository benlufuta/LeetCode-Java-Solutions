class ValidPalindrome {
    public boolean isPalindrome(String s) {

        /*

            Pattern: Two Pointers
            Time: O(n)
            Space: O(1)

            Idea: A palindrome reads the same forwards and backwards, 
            so we verify symmetry by comparing characters from both ends moving inward, 
            skipping non-alphanumeric characters along the way."

        */

        // Left starts at the beginning of the string, right starts at the end.
        int left = 0;
        int right = s.length() - 1;

        while (left < right){

            // If the current left character is not alphanumeric,
            // skip it by moving the left pointer forward.
            if (!Character.isLetterOrDigit(s.charAt(left))){
                left++;
            } 
            // If the current right character is not alphanumeric,
            // skip it by moving the right pointer backward.
            else if (!Character.isLetterOrDigit(s.charAt(right))){
                right--;
            } 
            // Otherwise, both characters are alphanumeric:
            // compare them in a case-insensitive way.
            // If they differ, return false. If they match, move both pointers.
            else {
                
                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) { 
                    return false;

                } else {
                    left++;
                    right--;
                }
            }
        }
        // If we exit the loop without finding a mismatch, it is a palindrome.
        return true;        
    }
}