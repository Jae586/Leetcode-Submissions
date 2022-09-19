class Solution {
    public double average(int[] salary) {
 double min = 100000;
        double max = -100000;
        double sum = 0;
        for (int i=0; i<salary.length; i++){
            sum+=salary[i];
            if (salary[i] >= max) max = salary[i];
            if (salary[i] <=min) min = salary[i];
        }
        sum = sum - max -min;
        return sum/(salary.length-2);
    }
    
}