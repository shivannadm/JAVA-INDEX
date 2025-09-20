// 1822. Sign of the Product of an Array

class Solution {
    public int arraySign(int[] nums) {
        int product = 1;
        for(int num:nums){
            product *= num;
        }
        if(product >0){
            return 1;
        }else if(product==0){
            return 0;
        }
        return -1;
    }
}
