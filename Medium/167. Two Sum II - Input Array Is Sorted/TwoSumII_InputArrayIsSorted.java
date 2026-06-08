public class TwoSumII_InputArrayIsSorted {

    public int[] twoSum(int[] numbers, int target) {

        /*

            Pattern: Two Pointers
            Time Complexity: O(n)
            Space Complexity: O(1)

            Idea:Because the values are sorted, the two-pointer technique is effective.
            We can adjust the sum deterministically: move the left pointer right to increase the sum,
            or move the right pointer left to decrease it, allowing us to efficiently search for the target.
        
         */

        // First index starts at the beginning, and second index starts at the end of the array.
        int left = 0;
        int right = numbers.length - 1;

        //Loop through array as long as index one is smaller than second index.
        while (left < right) {
            
                // If the sum of the first and second indices equals the target,
                // return those indices plus 1 as required.
                if ((numbers[left] + numbers[right]) == target){

                    return new int [] {left+1, right+1};

                } 
                //If the sum is too large, move the larger value inward.
                else if ((numbers[left] + numbers[right]) > target){

                    right--;
                } 
                //If the sum is too small, move the smaller value inward. 
                else {

                    left++;
                }
            } 

        return new int [] {};

    }
}
