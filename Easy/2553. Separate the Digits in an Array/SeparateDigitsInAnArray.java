public class SeparateDigitsInAnArray {
    
    public int[] separateDigits(int[] nums) {
        
        String result = "";

        for (int i = 0; i < nums.length; i++) {

            String current = String.valueOf(nums[i]);

            for (int j = 0; j < current.length(); j++){

                result = result + current.charAt(j);
            }
        }

        int [] answer = new int [result.length()];

        for (int k = 0; k < answer.length; k++){

            answer[k] = Character.getNumericValue(result.charAt(k));
        }

        return answer;
    }
}
