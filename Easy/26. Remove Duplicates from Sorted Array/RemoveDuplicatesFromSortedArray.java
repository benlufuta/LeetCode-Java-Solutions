public class RemoveDuplicatesFromSortedArray {
    
       public int removeDuplicates(int[] nums) {

        //First pointer to scan the whole array
        int p1 = 0;

        //Second pointer to only keep track of unique values.
        int p2 = 0;

        while (p1 < nums.length){

            if (nums[p1] != nums[p2]){
                
                p2++;

                nums[p2] = nums[p1];

            }  p1++;

        }

        // Return the number of unique elements.
        // Add 1 because the pointer starts at index 0.
        return p2 + 1;
        
    }
}
