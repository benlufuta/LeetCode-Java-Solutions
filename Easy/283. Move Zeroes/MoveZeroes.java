public class MoveZeroes {

    public void moveZeroes(int[] nums) {

        int p1 = 0;
        int p2 = 0;

        while (p1 < nums.length){

            if (nums[p1] != 0){

                nums[p2] = nums[p1];

                if (p1 != p2 ) {nums[p1] = 0;} //too prevent overriding values.

                p2++;

            } 
                
                p1++; 
                

            } 
    }
    
}
