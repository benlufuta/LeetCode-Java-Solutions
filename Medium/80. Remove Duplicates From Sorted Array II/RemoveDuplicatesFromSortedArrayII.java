public class RemoveDuplicatesFromSortedArrayII {
    
    public int removeDuplicates(int[] nums) {

        /*
            Pattern: Two Pointers
            Time Complexity: O(n)
            Space Complexity: O(1)

            Idea: Use two pointers to keep track of the current position in the array. 
            The slow pointer will keep track of the position of the last unique element, while the fast pointer will iterate through the array. 
            If the current element at the fast pointer is not equal to the element at the slow pointer minus one, it means we have found a new unique element. 
            We can then move the slow pointer forward and update the value at the slow pointer to be the current element at the fast pointer. 
            Finally, we return the length of the modified array, which is slow + 1.
        
        */

        //Slow pointer starts at index 1, fast pointer starts at index 2 because we can have at most two duplicates, 
        // so we need to compare the current element with the element at slow - 1.
        int slow = 1;
        int fast = 2;

        // Iterate through the whole array with the fast pointer
        while (fast < nums.length){

            // If the current element at the fast pointer is not equal to the element at the slow pointer minus one,
            // it means we have found a new unique element.
            if (nums[fast] != nums[slow - 1]){
                // Move the slow pointer forward and update the value at the slow pointer to be the current element at the fast pointer.
                slow++;

                // Update the value at the slow pointer to be the current element at the fast pointer.
                nums[slow] = nums[fast];

            }

            //Always move the fast pointer forward to continue iterating through the array.
            fast++;
        }

        //Return total number of unique elements, which is slow + 1 because the slow pointer is zero-indexed.
        return slow + 1;
        
    }
}
