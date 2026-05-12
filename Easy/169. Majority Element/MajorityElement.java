public class MajorityElement {

    public int majorityElement(int[] nums) {

        HashMap <Integer, Integer> numsAndOccurence = new HashMap<>();

         int key = 0;

        for (int i = 0; i < nums.length; i++){

            key = nums[i];

            if (!numsAndOccurence.containsKey(key)){

                numsAndOccurence.put(key, 1);
            } else {

                Integer count = numsAndOccurence.get(key);

                numsAndOccurence.merge(key, 1, Integer::sum);

                if (count >= (nums.length / 2)) {

                    return key;
   
                }
            } 
        }
        
        return key;
    }
}