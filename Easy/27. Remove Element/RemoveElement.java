public class RemoveElement {
    
    /*  
        Speed and Space Efficient Solution.
        Time Complexity:
        Space Complexity: 
        Idea: Using two pointers from both ends to swap unwanted elements to the back in a single pass.
    */
    public int removeElement(int[] nums, int val) {
        
        //Pointers for front and back tracking.
        int left = 0;
        int right = nums.length - 1;

        //Counter for numbers that are not equal to targeted value.
        int k = 0;

        //Continue looping until condition true.
        while (left <= right){

            //if current number on left index equal to targeted value
            //replace with current value at right index.
            if (nums[left] == val ){

                nums[left] = nums[right];

                right--;

            } 
            
            //Otherwise, increase k by one and also move left pointer inward.
            else {

                k++;
                left++;
            }
        }
        return k;
    }
}
