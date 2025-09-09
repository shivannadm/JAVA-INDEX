class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        int s1 = 0;
        int s2 = 0;
        for(int i=0;i<n;i++){
            s1 += nums[i];
            s2 += i*nums[i];
        }

        int res = s2;
        for(int i=0;i<n;i++){
            s2=s2-s1+(n)*nums[i];
            res = Math.max(res,s2);
        }
        return res;
    }
}
