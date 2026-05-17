public class TwoSumII_InputArrayIsSorted {
    

    /*

    Brute Force Solution: Works but not as efficient in terms of speed.
    Time: O(n²)
    Space: O(1)

    Idea: Check every possible pair in the array. If the pair adds up to the target, return their indices.
    
    */

    public int[] twoSumBruteForce(int[] numbers, int target) {

        for (int i = 1; i < numbers.length; i++) {

            for (int j = 0; j < i; j++){
            
                if ((numbers[i] + numbers[j]) == target){

                    return new int [] {j+1, i+1};

                } 

            }
        }

        return new int [] {};
    }


    public int[] twoSum(int[] numbers, int target) {

        /*

            Efficient Solution.
            Time Complexity: O(N)
            Space Complexity: O(1)

            Idea:use the sorted property with two pointers moving from ends to find the target sum efficiently.
        
         */

        // First index starts at the beginning, and second index starts at the end of the array.
        int p1 = 0;
        int p2 = numbers.length - 1;

        //Loop through array as long as index one is smaller than second index.
        while (p1 < p2) {
            
                // If the sum of the first and second indices equals the target,
                // return those indices plus 1 as required.
                if ((numbers[p1] + numbers[p2]) == target){

                    return new int [] {p1+1, p2+1};

                } 
                //If the sum is too large, move the larger value inward.
                else if ((numbers[p1] + numbers[p2]) > target){

                    p2--;
                } 
                //If the sum is too small, move the smaller value inward. 
                else {

                    p1++;
                }

            } 

        //Return an empty array if no solution was found.
        return new int [] {};

    }
}
