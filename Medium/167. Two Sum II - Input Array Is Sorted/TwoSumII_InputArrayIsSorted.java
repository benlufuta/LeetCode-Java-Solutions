public class TwoSumII_InputArrayIsSorted {
    

    /*

    Brute Force Solution: Works but not as efficient in terms of speed.
    Time: O(n²)
    Space: O(1)
    
    */

    public int[] twoSum(int[] numbers, int target) {

        for (int i = 1; i < numbers.length; i++) {

            for (int j = 0; j < i; j++){
            
                if ((numbers[i] + numbers[j]) == target){

                    return new int [] {j+1, i+1};

                } 

            }
        }

        return new int [] {};
    }
}
