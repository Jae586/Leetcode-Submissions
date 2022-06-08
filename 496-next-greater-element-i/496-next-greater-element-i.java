class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap <Integer, Integer> map = new HashMap<>();
        
        Stack<Integer> stack = new Stack<>();
        for (Integer numbers: nums2){
        while (!stack.isEmpty() && stack.peek() < numbers){
            map.put(stack.pop(), numbers);
        }
        stack.push(numbers);
        }
        for (int i =0; i<nums1.length; i++){
            nums1[i] = map.getOrDefault(nums1[i], -1);
        }
        return nums1;
    }
}