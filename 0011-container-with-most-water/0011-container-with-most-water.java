class Solution {
    public int maxArea(int[] height) {
        
        int max = -1;
    int right = height.length-1; 
    int left = 0; 
    while(left < right){
        int curr = Math.min(height[left], height[right]) * (right -left) ;
        if (curr > max){
            max = curr;
        }
        if (height[left] > height[right]){
            right--;
        } else {
            left++;
        }
    }
        return max;

    }
}