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

    /*
        Speed Efficent Solution
        Time Complexity: O(N)
        Space Complexity: O(N)
        Idea: Utilizing two pointers from both ends to fill the result array in reverse order based on squared values.
    
    */
    public int[] sortedSquares(int[] nums) {

        //Serve a index tracker for new array.
        int k = nums.length;
        
        //First pointer starts at beginning of the array.
        int p1 = 0;
        //Second pointer starts at end of the array.
        int p2 = k - 1;
        
        //Will store all squared values.
        int [] sortedNums = new int [k];
        
        //Help keep track current values.
        int squaredOne = 0;
        int squaredTwo = 0;
      
        while ( p1 <= p2){
            
            squaredOne = nums[p1] * nums[p1];
            squaredTwo = nums[p2] * nums[p2];
            
            // Squared value at the second pointer is greater than
            // or equal to the squared value at the first pointer,
            // so store it in the next available inward index
            // of the new array.
            if (squaredOne <= squaredTwo){
            
                sortedNums[k - 1] = squaredTwo;
                k--;
                p2--;
            
            } 
            //If above contion fails, then store value at first pointer.
            else {

                sortedNums[k - 1] = squaredOne;
                k--;
                p1++;
            
            }
            
        }
      
      return sortedNums;
        
    }
}
