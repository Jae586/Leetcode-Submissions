class Solution {
    public int findMin(int[] nums) {
        int min = 10000000;
        int left = 0; 
        int right = nums.length-1;

        while(left <= right){
            int mid = left + (right-left)/2;
 

            if (nums[left] <=nums[mid]){
                min = Math.min(nums[left], min);
                left = mid+1;
            } else {
                min = Math.min(nums[mid], min);
                right = mid-1;
            }
            

        }
        return min;
    }
}