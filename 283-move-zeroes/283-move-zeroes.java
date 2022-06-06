class Solution {
    public void moveZeroes(int[] nums) {
    int nonZero =0;
        int isZero=0;
        
        while (nonZero < nums.length){
            if (nums[nonZero] != 0){
                nums[isZero++] = nums[nonZero];
            }
            nonZero++;
            }
        while (isZero<nums.length){
            nums[isZero++] = 0;
        }
    
    }
}