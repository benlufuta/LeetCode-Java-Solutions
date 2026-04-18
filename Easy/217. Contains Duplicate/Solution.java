class Solution {
    public boolean containsDuplicate(int[] nums) {
         /*
            1. Solution using HashSet
            Time complexity: O(n)
            Space complexity: O(n)
        */

        //Set to store unique found numbers.
        HashSet <Integer> foundNums = new HashSet<>();

        for (int num: nums) {

            //If found, then return true because 
            //the current number has already been added set.
            if (!foundNums.add(num)){

                return true;

            }
        }

        return false;
    }
}