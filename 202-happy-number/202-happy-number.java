class Solution {
    public boolean isHappy(int n) {
        int s=n, f=n;
        do{
       s = compute(s);
        f = compute(compute(f));
            if(s==1) return true;
        }while (s!=f);
        return false;
        

    }
    
    public int compute ( int s){
        int q =0;
        while (s!=0){
            q+= (s%10)*(s%10);
            s= s/10;
        }
        return q;
    }

}