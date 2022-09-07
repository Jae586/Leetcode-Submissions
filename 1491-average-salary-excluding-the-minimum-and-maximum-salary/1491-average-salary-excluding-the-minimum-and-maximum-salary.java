class Solution {
    public double average(int[] salary) {
        double min =100000;
        double max =-100000;
        double sum =0;
        for (int i=0; i<salary.length; i++){
            if (salary[i] < min) {
                min = salary[i];
            } if (salary[i] > max){
                max = salary[i];
            }
               sum+=salary[i]; 
        }
        sum = sum - min - max;
        return (sum)/(salary.length-2);
    }
}