public class SquaresOfASortedArray {


    /*
        Brute Force Solution: Not efficient but still working.
        Time Complexity: O(n²)
        Space Complexity: O(1)

        Idea: Square every value and Sort the array afterward.
    */
    public int[] sortedSquaresBruteForce(int[] nums) {

        //Square every value.
        for(int i = 0; i < nums.length; i++){

            nums[i] = nums[i] * nums[i];
        }
        
        //Sort the squared values.
        for (int i = 0; i < nums.length; i++){
            
            for (int j = 0; j < i; j++){
                
                int temp = 0;
                
                if (nums[i] < nums[j]){
                
                temp = nums [i];
                
                nums[i] = nums[j];
                
                nums[j] = temp;

                }
            }   
        }

        return nums;
    }
}
