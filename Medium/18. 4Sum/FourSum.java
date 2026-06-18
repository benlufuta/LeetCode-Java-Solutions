import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class FourSum {

    public List<List<Integer>> fourSum(int[] nums, int target) {

        Arrays.sort(nums);
        
        List<List<Integer>> results = new ArrayList<>();

        for (int i = 0; i < nums.length - 1; i++){

            if (i > 0 && nums[i] == nums[i - 1]){

                continue;
            }

            for (int j = i + 1; j < nums.length - 1; j++){

                int left = j + 1;
                int right = nums.length - 1;

                if ( j > i + 1 && nums[j] == nums[j - 1]){

                    continue;
                }

                while (left < right){

                    long total = (long)nums[i] + nums[j] + nums[left] + nums[right];

                    if (total == target){

                      results.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                    left++;
                    right--;

                    while ((left >= 1 && left < right) && (nums[left] == nums[left-1])){

                        left++;
                    } 

                    while ((right < nums.length - 1 && right > left) && (nums[right] == nums[right + 1])){

                        right--;
                    }  
                    } else if (total < target){

                        left++;
                    } else {

                        right--;
                    }
                }
            }
        }

        return results;
        
    }
    
}
