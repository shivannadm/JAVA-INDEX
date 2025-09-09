// Not Optimized
class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        int max = 0;
        for(int i=0;i<n;i++){
            max = max + (i*nums[i]);
        }

        
        for(int i=0;i<n;i++){
            int m2=0;
            for(int j=n-1;j>0;j--){
                int temp = nums[j];
                nums[j] = nums[j-1];
                nums[j-1] = temp;
            }
            
            for(int k=0;k<n;k++){
                m2 = m2+(k*nums[k]);
            }
            max = Math.max(max,m2);
        }
        return max;
    }
}
