class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[] = new int[nums.length];
        int q =0;
        int counter =0;
        while(n<nums.length){
            arr[counter++] = nums[q++];
            arr[counter++] = nums[n++];
        }
        return arr;
    }
}