public class ReverseString {

    public void reverseString(char[] s) {

        /*
            Pattern: Two Pointers
            Time Complexity: O(n)
            Space Complexity: O(1)

            Idea: Start with left = 0 and right = length - 1. 
            While left < right, swap their values and move inward. 
            Stop when the pointers meet or cross.
        
        */

        int left = 0;
        int right = s.length - 1;

        while (left < right) {

            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
        
    }
}
