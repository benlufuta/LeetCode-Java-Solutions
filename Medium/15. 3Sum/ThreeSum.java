import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    
    public List<List<Integer>> threeSum(int[] nums) {
    
    /*
        Time Complexity: O(n²)
        Space Complexity: O(1)
        Pattern: Sorting / Two Pointers
        Idea: Sort the array then use a fixed anchor with two moving pointers to find triplets summing to zero.

    */

        //Store the 
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            
            //Anchor: skip if nums[i] == nums[i-1]
            if(i > 0 && nums[i] == nums[i-1]){

                        continue;
            }
            
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {

                //Add values of current indices.
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    // add triplet to result
                    result.add(new ArrayList<>(List.of(nums[i],nums[left],nums[right])));

                    // Move past the current numbers we just added to the result
                    left++;
                    right--;

                    // Now skip any identical numbers to avoid duplicate triplets
                    while (left < right && nums[left] == nums[left - 1]) { 
                        left++; 
                    } 
                    while (left < right && nums[right] == nums[right + 1]) { 
                        right--; 
                    }

                } else if (sum < 0) {
                    // move left pointer if sum is less than zero.
                    left++;

                } else {
                    // move right pointer if sum is greater than zero
                    right--;
                }
            }
        }
        return result;
            
    }
}
