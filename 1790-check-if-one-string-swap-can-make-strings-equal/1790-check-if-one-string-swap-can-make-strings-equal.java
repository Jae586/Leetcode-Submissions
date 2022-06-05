class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        int counter =0;
        
        for (int i=0; i<s1.length(); i++){
             char sam = s1.charAt(i);
             char ss = s2.charAt(i);
            if (sam != ss){
                counter++;
            }
        
       if (counter > 2) return false;
        
            arr1[sam -'a']++;
            arr2[ss-'a']++;
        }
  
        return Arrays.equals(arr1,arr2);
        
    }
}