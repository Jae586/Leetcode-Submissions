class Solution {
    public String mergeAlternately(String word1, String word2) {
       int len1 = word1.length();
        int len2 = word2.length();
        int pointer1 =0, pointer2 =0, finalPoint=0;
        char arr[] = new char[len1 + len2];
        while (pointer1 < len1 || pointer2 <len2){
            if (pointer1 < len1){
                arr[finalPoint++] = word1.charAt(pointer1++);
            }
            if (pointer2 < len2){
                arr[finalPoint++] = word2.charAt(pointer2++);
            }
        }
        
        return new String(arr);
    }
}