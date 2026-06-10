public class RemoveDuplicatesFromSortedArray {
    
       public int removeDuplicates(int[] nums) {

        /*
            Pattern: Two Pointers
            Time Complexity: O(n)
            Space Complexity: O(1)

            Idea: Use two pointers that start at the beginning of the array, one slow and one fast.
            The slow pointer will keep track of the last unique element, while the fast pointer will iterate through the array.
            Whenever we find a new unique element, we move the slow pointer forward and 
            update the value at the slow pointer to the new unique element found by the fast pointer. 
            This way, we can overwrite the duplicates in place and return the length of the unique elements at the end.
        
        */

        //Pointer to keep track of the last unique element
        int slow = 0;

        //Pointer to iterate through the whole array. Starting from the second element since the first element is always unique.
        int fast = 1;

        //Iterate through the array until the fast pointer reaches the end
        while (fast < nums.length){

            //If the current element at the fast pointer is different from the last unique element at the slow pointer, we found a new unique element
            if (nums[slow] != nums[fast]){

                //Move the slow pointer forward to the next position
                slow++;

                //Update the value at the slow pointer to the new unique element found by the fast pointer
                nums[slow] = nums[fast];
            } 

            //Always move the fast pointer forward to continue iterating through the array
            fast++;
        }

        //Return the length of the unique elements, which is the position of the slow pointer + 1 (since it's zero-indexed)
        return slow + 1;
        
    }
}
