class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left =0; 
        HashSet<Character> set = new HashSet<>();
        char[] arr = s.toCharArray();
        int length =0; 
        int arrlength = arr.length;
        for (int i=0; i< arrlength; i++){
            while(set.contains(arr[i])){
                set.remove(arr[left]);
                left++;
            }
            set.add(arr[i]);
            if (set.size() > length){
                length = set.size();
            }
        }
        return length;

    }
}