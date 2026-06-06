public class MoveZeroes {

    public void moveZeroes(int[] nums) {

        /*
            Pattern: Two Pointers
            Time Complexity: O(n)
            Space Complexity: O(1)

            Idea: Both pointers start at the same end because the left pointer tracks the next position for a non-zero value, 
            while the right pointer finds the next non-zero value to swap into a zero's position (current left).

        */

        int left = 0; //Slow Pointer.
        int right = 0; //Fast Pointer

        while (right < nums.length){

            if (nums[right] != 0){

                //If right has found a non-zero, please swap with left, and increase left by one.
                int temp = nums[left];
                
                nums[left] = nums[right];
                nums[right] = temp;

                left++;
            }

            //Move right by one everytime.
            right++;
        }

    }
    
}
