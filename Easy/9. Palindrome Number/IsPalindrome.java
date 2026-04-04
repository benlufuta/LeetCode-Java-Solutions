class Solution {
    public boolean isPalindrome(int x) {

        int reversedNum = 0;
        int temp = x;

        if (x < 0){

            return false;
        }

        while(temp >= 10){

            reversedNum = (reversedNum + (temp % 10)) * 10;
            temp = temp / 10;
        }

        reversedNum += temp;

        return x == reversedNum;
        
    }
}