public class SortColors {

    public void sortColors(int[] nums) {

            /* 
                Pattern: Two Pointers (Dutch National Flag Algorithm)
                Time Complexity: O(n)
                Space Complexity: O(1)

                Idea: Use three pointers to partition the array into three regions: 0s, 1s, and 2s.
                When mid pointer encounters a 0, it swaps the element with the low pointer and moves both pointers forward.
                When mid pointer encounters a 1, it leaves the element as is and moves the mid pointer forward.
                When mid pointer encounters a 2, it swaps the element with the high pointer and moves the high pointer backward.
                
                All unsorted elements are found between mid and high - 1 poistion.
                All zeros are found before the low pointer.
                All ones are found between the low and high pointers.
                All twos are found after the high pointer.
            */

            
            // Initialize the three pointers
            int low = 0;
            int mid = 0;
            int high = nums.length - 1;

            // Initialize the temporary variable for swapping.
            int temp;


            //Loop through the array until the mid pointer crosses the high pointer.
            while(mid <= high){

                //If the current element is 0, swap it with the element at the low pointer.
                //Move the low and mid pointers forward.
                if (nums[mid] == 0){

                    temp = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp;

                    low++;
                    mid++;

                } 
                //If the current element is 2, swap it with the element at the high pointer.
                //Move the high pointer backward.
                else if(nums[mid] == 2){

                    temp = nums[high];
                    nums[high] = nums[mid];
                    nums[mid] = temp;

                    high--;

                } 
                //If the current element is 1, leave it as is and move the mid pointer forward.
                else {

                    mid++;
                }
            }
            
        }
}