class Solution {
    public boolean isPalindrome(String s) {
        
        int left = 0; 
        int right = s.length()-1; 
        
        while(left < right){
            char le = s.charAt(left);
            char ri = s.charAt(right);
            while (!Character.isLetterOrDigit(le) && left <right){
                left++; 
                 le = s.charAt(left);
            }
            while (!Character.isLetterOrDigit(ri) && left <right){
                right--;
                 ri = s.charAt(right);
            }

            if (Character.toLowerCase(le) != Character.toLowerCase(ri)){
                return false; 
            }
            left++;
            right--;
        }
        return true;
    }
}