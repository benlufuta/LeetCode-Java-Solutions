public class ContainerWithMostWater {
    
    public int maxArea(int[] height) {
        /*

            Pattern: Two Pointers
            Time Complexity: O(n)
            Space Complexity: O(1)
            Idea: Use two pointers at the start and end of the array, calculate area, 
            and move the pointer with the smaller height inward to potentially find a 
            larger area given that we lose some width every time we move a pointer 
            (regardless of which pointer we move).

        */

        //Two pointers at the start and end of the array
        int left = 0;
        int right = height.length - 1;

        //Variable to keep track of the maximum area found
        int maxWater = 0;

        //Loop until the two pointers meet
        while(left < right){

            //Calculate the area formed by the lines at the left and right pointers
            int area = Math.min(height[left], height[right]) * (right - left);

            //Update maxWater if the current area is larger
            maxWater = Math.max(maxWater, area);

            //Move the pointer with the smaller height inward to potentially find a larger area
            if (height[left] < height[right]) {

                left++;

            } 
            //Move the right pointer inward if the height at the right pointer is smaller 
            // or equal to the height at the left pointer
            else {

                right--;
            }
        }

        //return the maximum area found
        return maxWater;
    }
}
