class Solution {
    public boolean isPalindrome(String s) {

        //Working solution (somewhat efficient) but more efficient solution coming soon...
        //Time complexity efficient but not as memory efficient.

        //Remove any non alphanumerical characters and make lowercase.
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        //Start and End pointers.
        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right){

            //If character at left does not equal character at right return false.
            if (cleaned.charAt(left) != cleaned.charAt(right)) {

                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
