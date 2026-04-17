class Solution {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        //Brute Force Solution:
        //Solution that works but not time or space complexity efficient.
        /*for (int i = 0; i < nums.length; i++){

            for (int j = i + 1; j < nums.length; j++){

                if ((nums[i] == nums[j]) && (Math.abs(i - j) <= k)){

                    return true;
                }
            }
        }

        return false;*/

        //Time and Space complexity efficient Solution
        //Time O(N)
        //Space O(N)
        HashMap <Integer, Integer> numAndIndex = new HashMap<>();

            //Go through the whole array once.
            for (int i = 0; i < nums.length; i++){

                // If the current element is already in the HashMap, we’ve seen a duplicate.
                // If the value between the current index and the stored index is
                // less than or equal to k, return true.
                if (numAndIndex.containsKey(nums[i]) && Math.abs(numAndIndex.get(nums[i])- i) <= k) {

                        return true;
                    }

                    //Otherwise, add element to HashMap and also store its index.
                    numAndIndex.put(nums[i], i);
                }
            //Return false only if no duplicate. 
            return false;
    }

}