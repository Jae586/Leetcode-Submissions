class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int distance =0;
        for (int i=1; i<arr.length-1; i++){
        distance = arr[i] - arr[i-1];
            if (distance != arr[i+1] - arr[i]) return false;
        }
        return true;
        
    }
}