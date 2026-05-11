public class TwoSum {

    /*
        Brute Force Solution
        Time Complexity: O(n²)
        Space Complexity: O(1)

        Idea:
        Check every possible pair in the array.
        If the pair adds up to the target,
        return their indices.
    */
    public int[] twoSumBruteForce(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {

                    return new int[]{i, j};
                }
            }
        }

        // Return empty array if no solution is found.
        return new int[]{};
    }


    /*
        HashMap Solution
        Time Complexity: O(n)
        Space Complexity: O(n)

        Idea:
        Store visited numbers and their indices in a HashMap.

        For each number:
        1. Calculate the complement needed to reach the target.
        2. Check if the complement already exists in the map.
        3. If it exists, return both indices.
        4. Otherwise, store the current number and index.
    */
    public int[] twoSum(int[] nums, int target) {

        // Stores number -> index
        HashMap<Integer, Integer> numToIndex = new HashMap<>();

        // Loop through the array once.
        for (int i = 0; i < nums.length; i++) {

            // Current number in the array.
            int current = nums[i];

            // Calculate the complement needed to reach the target.
            int needed = target - current;

            // If the complement already exists,
            // we found the pair.
            if (numToIndex.containsKey(needed)) {

                return new int[]{numToIndex.get(needed), i};
            }

            // Otherwise, store current number and index.
            numToIndex.put(current, i);
        }

        // Return empty array if no solution is found.
        return new int[]{};
    }
}