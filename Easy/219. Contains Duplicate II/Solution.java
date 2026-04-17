class Solution {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        //Brute Force Solution:
        //Solution that works but not time or space complexity efficient.
        for (int i = 0; i < nums.length; i++){

            for (int j = i + 1; j < nums.length; j++){

                if ((nums[i] == nums[j]) && (Math.abs(i - j) <= k)){

                    return true;
                }
            }
        }

        return false;
    }

}