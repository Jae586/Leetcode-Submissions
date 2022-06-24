class Solution {
    public boolean isPerfectSquare(int num) {
        if (num<2) return true;
        long left =2;
        long right = num/2;
        while(left<=right){
            long mid = left+(right-left)/2;
            long prod = mid*mid;
            if (prod == num) return true;
            if (prod < num) left = mid+1;
            if (prod>num) right =mid-1;
        }
        return false;
    }
}