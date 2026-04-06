import java.util.HashMap;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        /*
            1. Solution using HashMap
            Time complexity: O(n)
            Space complexity: O(n)
        */

        //Map to store found numbers as keys.
        HashMap <Integer, Boolean> foundNums = new HashMap<>();

        for (int i = 0; i < nums.length; i++){

            //If key is found, then return true because 
            //the current number has already been added
            //as a key therefore return true.
            if (foundNums.containsKey(nums[i])){

                return true;

            }
                //If not found, then add to map.
                foundNums.put(nums[i], true);
        }

        return false;
    }
}