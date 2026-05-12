public class IntersectionOfTwoArrays {
    
    public int[] intersection(int[] nums1, int[] nums2) {

        
        HashSet <Integer> seen = new HashSet <>();

        HashSet <Integer> result = new HashSet <>();


        for (int i = 0; i < nums1.length; i++){

            if (!seen.contains(nums1[i])){

                seen.add(nums1[i]);
            }
        }


        for (int i = 0; i < nums2.length; i++){

            if (seen.contains(nums2[i])){

                result.add(nums2[i]);
            }
        }


        int index = 0;

        int [] vals = new int [result.size()];

        for (Integer val: result) {

            vals[index] = val;
            index++;
        
        }

        return vals;
    }
}
