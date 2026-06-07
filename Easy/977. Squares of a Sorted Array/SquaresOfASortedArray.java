public class SquaresOfASortedArray {


    class Solution {
    public int[] sortedSquares(int[] nums) {

        /*
        
            Pattern: Two Pointers (Opposite ends, fill result in reverse.)
            Time Complexity: O(N)
            Space Complexity: O(N)
            
            Idea: Apply a two-pointer approach by starting at both ends of the sorted array. 
            At each step, compare the squared values and insert the larger one into the result array from the last index toward the first. 
            This produces a sorted array of squares in linear time.
    
        */
        int totalIndices = nums.length - 1; //Fill Pointer.

        int left = 0; //Left Pointer
        int right = nums.length - 1; //Right Pointer

        int [] result = new int [nums.length]; //New Array to store squared values.


        while (left <= right){

            int leftValue = nums[left] * nums[left];
            int rightValue = nums[right] * nums[right];

            // Squared value at the second pointer is greater than
            // or equal to the squared value at the first pointer,
            // so store it in the next available inward index of the new array.
            if(leftValue >= rightValue){

                result[totalIndices] = leftValue;
                totalIndices--;
                left++;

            } 
            //If above contion fails, then store value at first pointer.
            else {

                result[totalIndices] = rightValue;
                totalIndices--;
                right--;
            }
        }

        return result;
       
    }
}
}
