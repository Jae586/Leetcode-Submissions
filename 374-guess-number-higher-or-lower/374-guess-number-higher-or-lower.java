/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
            int left =0;
            int right = n;
            while (true){
                
            
            int mid = left +(right-left)/2;
                int check = guess(mid);
            if (check == -1) right = mid-1;
            if (check == 1) left = mid+1;
            if (check == 0) return mid;
            }
       
        
    }
}